package Unit19;

import java.io.*;
import java.net.*;

import org.omg.CORBA.PRIVATE_MEMBER;

public class MyTcp {
	
	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;
	
	
	void getServer() {
		try {
			server = new ServerSocket(8998);
			System.out.println("�������Ѿ��ɹ�����");
			while(true) {
				System.out.println("�ȴ��ͻ�������");
				socket = server.accept();
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				getClientMessage();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	private void getClientMessage() {
		
		try {
			while(true) {
				System.out.println("�ͻ�����"+reader.readLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			if (reader != null) {
				reader.close();
			}
			
			if (socket != null) {
				socket.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTcp tcp = new MyTcp();
		tcp.getServer();


	}

}
