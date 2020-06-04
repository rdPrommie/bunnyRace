package bunnyrace;

import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class keszitetteAblak {

    private static final String TEL = "Tel.: +36-20/444-2365";
    private static final String EMAIL = "E-mail: daniel.ruszin98@gmail.com";
    private static final String GITHUB = "Github: https://github.com/rdPrommie";
    
    private JPanel mainPanel = new JPanel();
    private JButton back = new JButton("Vissza");

    private JButton button_back = new JButton("Vissza");
    private JPanel main_panel = new JPanel();
    private JPanel panel_cim_sor = new JPanel();
    private JPanel panel_nev_sor = new JPanel();
    private JPanel panel_tovabbi_adatok_sor = new JPanel();
    private JPanel panel_vissza_gomb_sor = new JPanel();
    private JLabel label_keszitette = new JLabel("Készítette");
    private JLabel label_nev = new JLabel("Ruszin Dániel");
    private JLabel label_tovabbi_adatok = new JLabel("");

    public keszitetteAblak() {
        mainPanel.setLayout(new FlowLayout());
        back = new JButton("exit");

        mainPanel.add(new JLabel("Hello World"));
        mainPanel.add(back);

    }
    
    public void addBackBtnActionListener(ActionListener listener) {
      back.addActionListener(listener);
    }

    public JComponent getMainComponent() {
        return mainPanel;
    }

}
