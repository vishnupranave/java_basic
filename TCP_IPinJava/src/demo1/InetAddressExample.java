package demo1;

import java.io.ObjectInputStream.GetField;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("Local Host: " + address.getHostName());
			System.out.println("Address: " + address.getHostAddress());
			InetAddress[] i = InetAddress.getAllByName("8.8.8.8");
			System.out.println(i[0].getCanonicalHostName());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
}
