/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Edward Potapov
 */
class SyncPipe implements Runnable {
    private final JTextArea out;
    private final InputStream istrm;
    public SyncPipe(InputStream istrm1, JTextArea area) {
        istrm = istrm1;
        out = area;
    }
    public void run() {
        try {
            final byte[] buffer = new byte[1024];
            for (int length = 0; (length = istrm.read(buffer)) != -1; ) {
                out.append(new String(buffer, 0, length));
                out.setCaretPosition(out.getDocument().getLength());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
  
}
