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
			System.out.println("本机名："+localnname);
			System.out.println("本机ip地址是："+localip);
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
