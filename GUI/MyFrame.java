package GUI;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	MyFrame(){
		

		ImageIcon image = new ImageIcon("kyut.png");
		
		
		this.setTitle("Java GUI");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420, 420);
		this.setVisible(true);
		
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.cyan);
	}
	
	
}
