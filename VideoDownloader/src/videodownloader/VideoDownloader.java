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
            if (System.getProperty("os.name").contains("Windows")) {
                Process p = rt.exec(new String[] {"cmd.exe", "/c",  "cd \"youtube-dl\" & cmd.exe /k \"youtube-dl \"" + Link + "\""}); //executes order 66
                new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
	        new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
            }
            if (System.getProperty("os.name").contains("Mac OS X"))
            {
                Process p = rt.exec(new String[] {"/bin/sh", "-c",  "cd youtube-dl && ./youtube-dl " + Link}); //executes order 66 for mac
                String line1;
                BufferedReader in = new BufferedReader( new InputStreamReader(p.getInputStream()) );
                while ((line1 = in.readLine()) != null) {
                  System.out.println(line1);
                }
                p.waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
