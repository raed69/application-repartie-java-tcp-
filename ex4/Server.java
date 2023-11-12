import java.net.*;
import java.io.*;

public class Server extends Thread {
	public void run() {
		try {
		ServerSocket ss = new ServerSocket (1234);
	while (true) {
		System.out.println("j'attende la connexion");
			Socket s = ss.accept();
			new Service (s).start();
	
	} }catch(IOException e) {e.printStackTrace();}}


public static void main (String [] args) {
	new Server().start();
}}
