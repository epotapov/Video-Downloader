/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;
import javax.swing.*;
/**
 *
 * @author Edward Potapov
 */
public class DisplayPanel extends javax.swing.JPanel{
    JButton butt;
    JLabel lab;
    public DisplayPanel() {
        setLayout(null);
        setSize(400, 300);
        butt = new JButton("Download");
        butt.setBounds(150, 200, 100, butt.getPreferredSize().height);
        add(butt);
        lab = new JLabel("Video Downloader by Epot");
        lab.setBounds(150, 50, lab.getPreferredSize().width, lab.getPreferredSize().height);
        add(lab);
    }
}
