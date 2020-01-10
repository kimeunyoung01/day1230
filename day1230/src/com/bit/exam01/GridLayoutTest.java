package com.bit.exam01;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {

	public GridLayoutTest() {
		setLayout(new GridLayout(3, 5));
		
		for(int i=1 ; i<=15 ; i++ ) {
			add( new JButton("¹öÆ°"+i) );
		}
		
		setSize(400, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutTest();
	}

}
