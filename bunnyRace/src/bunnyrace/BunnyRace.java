package bunnyrace;

import javax.swing.UIManager;

public class BunnyRace {
    JFrame frameStartWindow = new bunnyrace.startAblak();
    public BunnyRace() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new BunnyRace();
    }
    
}
