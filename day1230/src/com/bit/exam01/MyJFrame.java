package com.bit.exam01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	
	public MyJFrame() {
		setLayout(new FlowLayout());
		for(int i=1 ; i<= 15  ; i++ ) {
			add( new JButton("��ư"+i) );
		}
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyJFrame();
	}

}
