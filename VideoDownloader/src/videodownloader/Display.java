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
        setTitle("Stuff Downloader");//I know it said video but i was wrong i am pea brain and you can do way more with youtube-dl you can watch poirn and that is cool if you don't tell your parents thats cool so thats why its stuff downloader
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        add(p);
        
    }
    
}
