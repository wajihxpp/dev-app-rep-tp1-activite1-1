package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	public static void main( String[] args) {
		try {
			Socket socket = new Socket("localhost",1234);
			//La premiere etape:
			//� completer (TODO)
			System.out.println("Je suis un client pas encore connect�");
			
			Socket s = socket;
		//la deuxieme etape:
			System.out.println("je suis un client connect�");
		//La derniere etape: fermer socket
			//� completer (TODO)
			InputStream is= s.getInputStream();
			OutputStream os= s.getOutputStream();
		}
		catch (IOException e)
		{
		e.printStackTrace();     }
	}
}
