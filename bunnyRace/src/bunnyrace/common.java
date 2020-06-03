package bunnyrace;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class common {
    
    public static Font font_bold_italic   = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20);
    public static Font font_italic        = new Font("Times New Roman", Font.ITALIC, 16);
    public static Font font_common        = new Font("Times New Roman", Font.PLAIN, 14);
    
    public static Map<String, String> CONFIG_DATA = new LinkedHashMap<String, String>();
    
    public static int randomIntBetween(int a, int b) {
        return (int)Math.floor(Math.random() * ( b-a+1 )+ a);
    }
    
    public static double randomDoubleBetween(double a, double b) {
        return (double) Math.floor(Math.random() * (b-a+1) + a);
    }
    
    public static void showInfoUzenet(String uzenet) {
        JOptionPane.showMessageDialog(null,
                uzenet, 
                "Info", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showHibaUzenet(String uzenet) {
        JOptionPane.showMessageDialog(null,
                uzenet,
                "Hiba!",
                JOptionPane.ERROR_MESSAGE);
    }
 
    public static void showWarningUzenet(String uzenet) {
        JOptionPane.showMessageDialog(null,
                uzenet,
                "Figyelem!",
                JOptionPane.WARNING_MESSAGE);
    }
    
    public static BufferedImage resize(BufferedImage img, int newW, int newH) { 
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }  
    
    public static void makeFullScreen(JFrame frame) {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = env.getDefaultScreenDevice();
        
        if(gd.isFullScreenSupported()) {
            gd.setFullScreenWindow(frame);
        }
    }

}
