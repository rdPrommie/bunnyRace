package bunnyrace;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class startAblak extends JFrame{
    
    private BufferedImage image;
    private JButton button_jatek                = new JButton("Játék");
    private JButton button_beallitasok          = new JButton("Beálltások");
    private JButton button_kilepes              = new JButton("Kilépés");
    private JButton button_keszitette           = new JButton("Készítette");
    private JPanel panel_cim                    = new JPanel();
    private JPanel panel_kep                    = new JPanel(); 
    private JPanel panel_gombok                 = new JPanel(); 
    private JLabel label_cim                    = new JLabel("Bunny Race");
    private JLabel label_title_pic              = new JLabel();
    
    public startAblak() {          
        felepit();
        setTitle("Excel to Database Generator");
        setResizable(false);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setSize(new java.awt.Dimension(500,400));
    }
    
    void felepit() {
        java.awt.Container cp = getContentPane();
        cp.setLayout(new javax.swing.BoxLayout(cp, 3));
        cp.add(panel_cim);
        try {
            ImageIcon ii = new ImageIcon(this.getClass().getResource(
                    "bunnies_title.gif"));
            label_title_pic.setIcon(ii);
            cp.add(label_title_pic, java.awt.BorderLayout.CENTER);
        } catch(Exception e) {
            System.err.println(e);
            common.showHibaUzenet("Nem található a fájl!");
            System.exit(0);
        }
        cp.add(panel_kep);cp.add(panel_gombok);
        panel_cim.add(label_cim); label_cim.setFont(common.font_bold_italic);
        
        
        panel_gombok.add(button_jatek); button_jatek.addActionListener(new startAblak.GombFigyelo());
        panel_gombok.add(button_keszitette); button_keszitette.addActionListener(new startAblak.GombFigyelo());
        panel_gombok.add(button_kilepes); button_kilepes.addActionListener(new startAblak.GombFigyelo());
        panel_gombok.add(button_beallitasok); button_beallitasok.addActionListener(new startAblak.GombFigyelo());
        
        pack();
       
    }
    
    class GombFigyelo implements java.awt.event.ActionListener{
        public void actionPerformed(java.awt.event.ActionEvent e){
            if(e.getSource() == button_kilepes) System.exit(0);
            else if(e.getSource() == button_keszitette) {
                dispose(); System.out.println("Disposed: startAblak.");
                System.out.println("setVisible: keszitetteAblak."); new keszitetteAblak().setVisible(true);
            }                
            else if (e.getSource() == button_jatek) {
                
            }
        }
    }
    
    
}
