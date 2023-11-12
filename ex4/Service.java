import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Service extends Thread {
    private Socket sck;

    public Service(Socket s) {
        this.sck = s;
    }

    public void run() {
        try {
           
            InputStream is = sck.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

           
            OutputStream os = sck.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            String ch1 = br.readLine();
            String ch2 = br.readLine();

           
            String res = ch1 + " " + ch2;

            
            pw.println(res);

           
            sck.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
