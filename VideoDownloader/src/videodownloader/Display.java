/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;

import javax.swing.JFrame;

/**
 *
 * @author Edward Potapov
 */
public class Display extends javax.swing.JFrame{
    DisplayPanel p = new DisplayPanel();
    public Display() {
        setTitle("Stuff Downloader");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        add(p);
        
    }
    
}
