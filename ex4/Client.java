import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.*;
import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
		try { Socket s = new Socket("localhost", 1234); 
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os,true);
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donner un chaine 1"); 
		String str=clavier.nextLine();
		
		pw.println(str);
		System.out.println("Donner un chaine 2");
		String str1=clavier.nextLine();
		pw.println(str1);
		String res = br.readLine();
		System.out.println(res);
		String res1 = br.readLine();
		System.out.println(res1);
		s.close();
		} catch (IOException e) { e.printStackTrace();
		}}
}