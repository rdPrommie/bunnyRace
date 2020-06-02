package bunnyrace;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;   

public class BunnyRace {
    JFrame frameStartWindow = new bunnyrace.startAblak();

    public BunnyRace() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        updateComponentTreeUI(frameStartWindow);updateComponentTreeUI(frameStartWindow);
        common.makeFullScreen(frameStartWindow);
        frameStartWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new BunnyRace();
    }
    
}
