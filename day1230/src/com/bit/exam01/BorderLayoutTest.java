package com.bit.exam01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	
	public BorderLayoutTest() {
		setLayout(new BorderLayout());
		
		add( new JButton("�̼���"), BorderLayout.NORTH  );
		add( new JButton("���ַ�"), BorderLayout.SOUTH  );
		add( new JButton("�̿���"), BorderLayout.EAST );
		add( new JButton("������"), BorderLayout.WEST );
		add( new JButton("�ֺ���"), BorderLayout.CENTER  );
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutTest();
	}

}




