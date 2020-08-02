/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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
    Font f;
    static JTextField text;
    public JTextArea area;
    static JScrollPane scroll;
    public DisplayPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
    void addtoScreen() {
        lab = new JLabel("Video Downloader");
        f = new Font("Rockwell", Font.BOLD, 35);
        lab.setFont(f);
        lab.setForeground(Color.RED);
        text = new JTextField("Enter Link");
        text.setMaximumSize(new Dimension(300, 20));
        butt = new JButton("Download");
        butt.addActionListener(new ButtonPress());
        area = new JTextArea();
        area.setMaximumSize(new Dimension(460, 125));
        area.setEditable(false);
        area.setFont(new Font("arial", Font.PLAIN, 12));
        scroll = new JScrollPane(area);
        scroll.setMaximumSize(new Dimension(460, 125));
        lab.setAlignmentX(Component.CENTER_ALIGNMENT);
        text.setAlignmentX(Component.CENTER_ALIGNMENT);
        butt.setAlignmentX(Component.CENTER_ALIGNMENT);
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 25)));
        add(lab);
        add(Box.createRigidArea(new Dimension(0, 30)));
        add(text);
        add(Box.createRigidArea(new Dimension(0, 15)));
        add(butt);
        add(Box.createRigidArea(new Dimension(0, 15)));
        add(scroll);
    }
    static class ButtonPress implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VideoDownloader.download(text.getText());
        }
        
    }
}
