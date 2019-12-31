/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Edward Potapov
 */
public class DisplayPanel extends javax.swing.JPanel { //ui stuff
    JButton butt;
    JLabel lab;
    static JTextField text;
    public DisplayPanel() {
        setLayout(null);
        setSize(400, 300);
        butt = new JButton("Download");
        butt.setBounds(150, 200, butt.getPreferredSize().width, butt.getPreferredSize().height);
        add(butt);
        butt.addActionListener(new ButtonPress());
        lab = new JLabel("<html><font size='12' color='red' face='Rockwell'>Stuff Downloader</font></html>");
        int centered = lab.getPreferredSize().width;
        lab.setBounds(200 - centered / 2, 30, centered, lab.getPreferredSize().height);
        add(lab);
        text = new JTextField("Enter Link");
        text.setBounds(50, 130, 300, 20);
        add(text);
    }
    static class ButtonPress implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VideoDownloader.download(text.getText());
        }
        
    }
}
