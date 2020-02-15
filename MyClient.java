import java.net.*;
import java.io.*;

public class MyClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.43.12",3333);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("stop")){
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2=din.readUTF();
			System.out.println("Server Says:" + str2);
			
			}
	}
}