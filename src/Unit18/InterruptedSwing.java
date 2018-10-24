package Unit18;

import java.awt.*;
import javax.swing.*;

public class InterruptedSwing extends JFrame {
	
	Thread thread;
	
	final JProgressBar progressBar = new JProgressBar();
	
	public InterruptedSwing() {
		super();
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true);
		
		thread = new Thread(new Runnable() {
			
			int count = 0;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				while(true) {
					progressBar.setValue(++count);
					
					try {
						thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
						System.out.println("œﬂ≥Ã÷–∂œ");
						break;
					}
				}
				
			}
		});
		
		thread.start();
		thread.interrupt();
	}
	
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		init(new InterruptedSwing(), 100, 100);

	}

}
