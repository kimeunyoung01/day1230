package com.bit.exam01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;

public class MyFrame extends Frame {

	public MyFrame() {
		setLayout(new FlowLayout());
		for(int i=1 ; i<=15 ; i++) {
			add( new Button("��ư"+i)  );
		}
		
		setSize(400, 300);
		setVisible(true);
		
	}
	
	public static void main(String []args) {
		new MyFrame();
	}
}






