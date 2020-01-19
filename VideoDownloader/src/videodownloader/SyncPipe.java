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
    private final OutputStream ostrm_;
    private final InputStream istrm_;
    public SyncPipe(InputStream istrm, OutputStream ostrm) {
        istrm_ = istrm;
        ostrm_ = ostrm;
    }
    public void run() {
        try {
            final byte[] buffer = new byte[1024];
            for (int length = 0; (length = istrm_.read(buffer)) != -1; ) {
                //DisplayPanel.area
                String out = "";
                ostrm_.write(buffer, 0, length);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
  
}
