package bunnyrace;

import javax.swing.JFrame;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;   

public class BunnyRace {
    JFrame frameMainFrame = new bunnyrace.mainFrame();
    public static BunnyRaceGetPropertyValues properties = new BunnyRaceGetPropertyValues();
    public BunnyRace() {
        try {
            common.CONFIG_DATA = properties.getPropValues();
            loadingScreen splash = new loadingScreen(6000);
//            splash.showSplash();
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        updateComponentTreeUI(frameMainFrame);updateComponentTreeUI(frameMainFrame);
//        common.makeFullScreen(frameMainFrame);
        frameMainFrame.setVisible(true);
    }

     public static void main(String[] args) {
        new BunnyRace();
    }
    
}
