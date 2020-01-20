/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videodownloader;
import java.io.InputStream;
import java.io.OutputStream;
/**
 *
 * @author Edward Potapov
 */
class SyncPipe implements Runnable {
    private final OutputStream ostrm;
    private final InputStream istrm;
    public SyncPipe(InputStream istrm1, OutputStream ostrm1) {
        istrm = istrm1;
        ostrm = ostrm1;
    }
    public void run() {
        try {
            final byte[] buffer = new byte[1024];
            for (int length = 0; (length = istrm.read(buffer)) != -1; ) {
                String out = new String(buffer.toString());
                DisplayPanel.area.append(out);
                ostrm.write(buffer, 0, length);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
  
}
