/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Edward Potapov
 */
public class Display extends javax.swing.JFrame{ //creates the window
    DisplayPanel p;
    public Display() {
        setTitle("Stuff Downloader");
        setSize(500, 340); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        p = new DisplayPanel();
        p.addtoScreen();
        add(p);
    }
}
