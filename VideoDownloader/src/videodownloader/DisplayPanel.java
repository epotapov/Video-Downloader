/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Edward Potapov
 */
public class DisplayPanel extends javax.swing.JPanel { //ui stuff
    JButton butt;
    JLabel lab;
    static JTextField text;
    public JTextArea area;
    static JScrollPane scroll;
    public DisplayPanel() {
        setLayout(null);
        butt = new JButton("Download");
        butt.setBounds(250 - butt.getPreferredSize().width / 2, 140, butt.getPreferredSize().width, butt.getPreferredSize().height);
        add(butt);
        butt.addActionListener(new ButtonPress());
        lab = new JLabel("<html><font size='12' color='red' face='Rockwell'>Stuff Downloader</font></html>");
        lab.setBounds(250 - lab.getPreferredSize().width / 2, 30, lab.getPreferredSize().width, lab.getPreferredSize().height);
        add(lab);
        text = new JTextField("Enter Link");
        text.setBounds(100, 110, 300, 20);
        add(text);
        area = new JTextArea();
        area.setBounds(20, 180, 460, 125);
        area.setEditable(false);
        area.setFont(new Font("arial", Font.PLAIN, 12));
        scroll = new JScrollPane(area);
        scroll.setBounds(20, 180, 460, 125);
        add(scroll);
    }
    static class ButtonPress implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VideoDownloader.download(text.getText());
        }
        
    }
}
