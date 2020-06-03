package bunnyrace;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class loadingScreen extends JWindow {
    
    private int duration;
     
    public loadingScreen(int d) {
        duration = d;
    }
     
    public void showSplash() {
         
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
         
        int width  = Integer.parseInt(common.CONFIG_DATA.get("width"));
        int height = Integer.parseInt(common.CONFIG_DATA.get("height"));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
         
        JLabel label_bunny = new JLabel(new ImageIcon(this.getClass().getResource("bunny_loading.gif")));
        JLabel label_loading = new JLabel(new ImageIcon(this.getClass().getResource("splash.gif")));
        content.add(label_bunny, BorderLayout.CENTER);
        content.add(label_loading, BorderLayout.SOUTH);
         
        setVisible(true);
         
        try { Thread.sleep(duration); } catch (Exception e) {}
         
        setVisible(false);
         
    }
    
}
