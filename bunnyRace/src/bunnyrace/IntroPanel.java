package bunnyrace;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class IntroPanel {

    private JPanel mainPanel = new JPanel();
    private JButton start = new JButton("Start");
    private JButton about = new JButton("Készítette");
    private JButton exit = new JButton("Exit");
    
    private Container c = new Container();
    public IntroPanel() {
        mainPanel.setLayout(new GridLayout(4,1));
        start = new JButton("Start"); start.setSize(new Dimension(128,256));
        about = new JButton("Készítette");about.setSize(128,128);
        exit = new JButton("Exit");exit.setSize(128,128);

        mainPanel.add(new JLabel("Bunny Race"), BorderLayout.NORTH); //@todo szerkezteni egy képet címnek
        mainPanel.add(start, BorderLayout.CENTER);
        mainPanel.add(about, BorderLayout.CENTER);
        mainPanel.add(exit, BorderLayout.SOUTH);
        
        about.setSize(128,128);
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window win = SwingUtilities.getWindowAncestor(mainPanel);
                win.dispose();
                System.exit(0);
            }
        });
    }

    public void addGameBtnActionListener(ActionListener listener) {
        start.addActionListener(listener);
    }
    
    public void addAboutBtnActionListener(ActionListener listener) {
        about.addActionListener(listener);
    }

    public JComponent getMainComponent() {
        return mainPanel;
    }
}
