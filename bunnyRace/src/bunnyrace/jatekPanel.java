package bunnyrace;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

class jatekPanel {

    private static final Dimension MAIN_SIZE = new Dimension(400, 200);
    private JPanel mainPanel = new JPanel();

    private JButton foo;
    private JButton bar;
    private JButton back;

    public jatekPanel() {
        foo = new JButton("Foo");
        bar = new JButton("Bar");
        back = new JButton("return to main menu");

        mainPanel.add(foo);
        mainPanel.add(bar);
        mainPanel.add(back);
        mainPanel.setPreferredSize(MAIN_SIZE);
    }

    public JComponent getMainComponent() {
        return mainPanel;
    }

    public void addBackBtnActionListener(ActionListener listener) {
        back.addActionListener(listener);
    }
}
