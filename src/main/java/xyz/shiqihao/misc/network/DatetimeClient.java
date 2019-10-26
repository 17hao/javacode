package xyz.shiqihao.misc.network;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class DatetimeClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("time.nist.gov", 13);
             InputStream is = new BufferedInputStream(socket.getInputStream())) {

            StringBuilder sb = new StringBuilder();
            for (int ch = is.read(); ch != -1; ch = is.read()) {
                sb.append((char) ch);
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}