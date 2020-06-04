package bunnyrace;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainFrame extends JFrame{
    
    private static final String ABOUT = "about";
    private static final String GAME = "game";
    private static final String INTRO = "intro";
    
    public CardLayout cardLayout = new CardLayout();
    public Container cp = getContentPane();
    
    private JPanel mainPanel                       = new JPanel(cardLayout);
    private IntroPanel introPanel                              = new IntroPanel();
    private keszitetteAblak keszitetteAblak              = new keszitetteAblak();
    private jatekPanel jatekPanel                        = new jatekPanel();
    
    public mainFrame() {          
        felepit();
        setFrame();
    }
    
    private void setFrame() {
        setTitle("BunnyRace");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        int width  = 1280;
        int height = 720;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        getContentPane().add(getMainComponent());
    }
    
    private void felepit() {
        mainPanel.add(introPanel.getMainComponent(), INTRO);
        mainPanel.add(jatekPanel.getMainComponent(), GAME);
        mainPanel.add(keszitetteAblak.getMainComponent(), ABOUT);

        introPanel.addGameBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, GAME);
            }
        });
        
        keszitetteAblak.addBackBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, ABOUT);
            }
        });
        
        jatekPanel.addBackBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, INTRO);
            }
        });

    }
    
    private JComponent getMainComponent() {
        return mainPanel;
    }
    
}
