package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ImageIcon image = new ImageIcon("kyut.png");
		
		
		frame.setTitle("Java GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420, 420);
		frame.setVisible(true);
		
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(Color.cyan);
		//frame.getContentPane().setBackground(new Color(0,0,0)); for rgb (new Color(0xFFFFFF)) for hex
		
		
		new MyFrame();
		
		
	}

}
