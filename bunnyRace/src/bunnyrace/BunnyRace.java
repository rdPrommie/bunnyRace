package bunnyrace;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;   

public class BunnyRace {
    JFrame frameStartAblak = new bunnyrace.startAblak();
    public static BunnyRaceGetPropertyValues properties = new BunnyRaceGetPropertyValues();
    public BunnyRace() {
        try {
            common.CONFIG_DATA = properties.getPropValues();
            loadingScreen splash = new loadingScreen(6000);
            splash.showSplash();
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        updateComponentTreeUI(frameStartAblak);updateComponentTreeUI(frameStartAblak);
//        common.makeFullScreen(frameStartWindow); //@todo
        frameStartAblak.setVisible(true);
    }

    public static void main(String[] args) {
        new BunnyRace();
    }
    
}
