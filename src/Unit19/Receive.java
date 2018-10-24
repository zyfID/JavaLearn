package Unit19;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;


public class Receive extends JFrame implements Runnable, ActionListener{
	
	int port;
	InetAddress group = null;
	MulticastSocket socket = null;
	
	JButton ince = new JButton("开始接收");
	JButton stop = new JButton("停止接收");
	JTextArea inceAr = new JTextArea(10,10);
	JTextArea inced = new JTextArea(10,10);
	
	Thread thread;
	boolean b = false;
	
	public Receive() {
		super("广播数据报");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		thread = new Thread(this);
		ince.addActionListener(this);
		stop.addActionListener(this);
		inceAr.setForeground(Color.blue);
		
		JPanel north = new JPanel();
		north.add(ince);
		north.add(stop);
		add(north, BorderLayout.NORTH);
		
		JPanel center = new JPanel();
		center.add(ince);
		center.add(stop);
		add(center, BorderLayout.CENTER);
		
		validate();
		port = 9898;
		
		try {
			group = InetAddress.getByName("224.155.10.0");
			socket = new MulticastSocket(port);
			socket.joinGroup(group);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		setBounds(100, 50, 360, 380);
		setVisible(true);
			
	}
	
	
	public void run() {
		while(true) {
			byte data[] = new byte[1024];
			DatagramPacket packet = null;
			
			packet = new DatagramPacket(data, data.length, group, port);
			try {
				socket.receive(packet);
				String message = new String(packet.getData(), 0, packet.getLength());
				
				inceAr.setText("正在接收的内容：\n"+message);
				inced.append(message+"\n");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			if (b==true) {
				break;
			}
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ince) {
			ince.setBackground(Color.red);
			stop.setBackground(Color.yellow);
			
			if (!(thread.isAlive())) {
				thread = new Thread(this);
			}
			
			thread.start();
			b = false;
		}
		
		if (e.getSource() == stop) {
			ince.setBackground(Color.yellow);
			stop.setBackground(Color.red);
			b = true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Receive rec = new Receive();
		rec.setSize(460,200);

	}

}
