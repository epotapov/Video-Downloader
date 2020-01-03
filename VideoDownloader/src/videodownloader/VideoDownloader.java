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
        String location = "C:\\Users\\Edward Potapov\\Documents\\NetBeansProjects\\Video-Downloader\\VideoDownloader\\youtube-dl"; 
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("cmd.exe /c cd \"youtube-dl\" & start cmd.exe /k \"youtube-dl "+ Link +"\"");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
