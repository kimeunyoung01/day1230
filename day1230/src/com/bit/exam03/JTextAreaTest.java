package com.bit.exam03;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaTest extends JFrame {

	public JTextAreaTest() {
		JTextArea jta = new JTextArea(10, 60);
		JScrollPane jsp = new JScrollPane(jta);
		setLayout(new FlowLayout());
		add(jsp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaTest();
	}

}
