/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;
import java.io.*;
/**
 *
 * @author Edward Potapov
 */
public class VideoDownloader { //contains the code 
    static Display d;
    public static void main(String[] args) { //this is not usally how i do stuff i usally don't make a bunch of class so thats weird
        d = new Display();
    }
    public static void download(String Link) {
        Runtime rt = Runtime.getRuntime();
        try {
            if (System.getProperty("os.name").contains("Windows")) 
                rt.exec("cmd.exe /c cd \"youtube-dl\" & start cmd.exe /k \"youtube-dl "+ Link +"\""); //executes order 66
            if (System.getProperty("os.name").contains("Mac OS X"))
                rt.exec("/usr/bin/open -a Terminal"); //executes order 66 for mac
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
