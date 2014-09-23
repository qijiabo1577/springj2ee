package test.baobaotao.service;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;

public class UDPClient {
	
	private static DatagramSocket socket;
	private static String ip = null;
	private static int port;
	private static int serverPort = 55000;
	private static String serverIp = "114.215.138.158";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			socket = new DatagramSocket();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ip = null;
			}
		}, 10000, 10000);
		
		new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				try {
					while(true) {
						if( ip != null) {
							Thread.sleep(2000);
							continue;
						}
						byte[] buf = "1".getBytes();
						DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName(serverIp), serverPort);
						socket.send(packet);
						Thread.sleep(2000);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				try {
					while(true) {
						byte[] buf = new byte[100];
						DatagramPacket packet = new DatagramPacket(buf, buf.length);
						socket.receive(packet);
						int remotePort = packet.getPort();
						if(remotePort == serverPort) {
							String message = new String(packet.getData(), 0, packet.getLength());
							String str2 = message.split(";")[1];
							System.out.println("-------->" + str2);
							ip = str2.split(":")[0];
							port = Integer.parseInt(str2.split(":")[1]);
							continue;
						}
						else {
							System.out.println("client-------->" + new String(packet.getData(), 0 , packet.getLength()));
						}
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					try {
						if(ip != null) {
							byte[] buf = "11111111111111111111111".getBytes();
							DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName(ip), port);
							socket.send(packet);
						}
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		}).start();
		
	}

}
