package goatPad;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		DisplayPanel display = new DisplayPanel(800, 800, Color.white);
		JFrame frame = new JFrame("Hello World Practice!");
		frame.setLayout(new BorderLayout());
		frame.add(display, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(display);
		frame.pack();
		
		JButton b=new JButton("PRINT");//creating instance of JButton  
		b.setBounds(225,350,100, 40);//x axis, y axis, width, height  
		          
		frame.add(b);//adding button in JFrame
		frame.setSize(400,500);//400 width and 500 height  
		frame.setLayout(null);//using no layout managers  
		frame.setVisible(true);//making the frame visible 
		
	}

}