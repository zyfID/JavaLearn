package Unit19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InetAddress ip;
		try {
			ip = InetAddress.getLocalHost();
			String localnname = ip.getHostName();
			String localip = ip.getHostAddress();
			System.out.println("��������"+localnname);
			System.out.println("����ip��ַ�ǣ�"+localip);
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
