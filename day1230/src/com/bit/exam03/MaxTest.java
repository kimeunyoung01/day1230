package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MaxTest extends JFrame implements ActionListener{
	
	JTextField jtf_num1;
	JTextField jtf_num2;
	JTextField jtf_result;
	
	public MaxTest() {
		jtf_num1 = new JTextField(5);
		jtf_num2 = new JTextField(5);
		jtf_result = new JTextField(5);
		
		setTitle("ū��ã�� ���α׷�");
		
		setLayout(new FlowLayout());
		add(new JLabel("ù��° ��:"));
		add(jtf_num1);
		
		add(new JLabel("�ι�° ��:"));
		add(jtf_num2);
		
		JButton btn = new JButton("ū��ã��");
		add(btn);
		btn.addActionListener(this);
		
		
		add(new JLabel("���:"));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MaxTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int max = Integer.parseInt(jtf_num1.getText());
		if(  Integer.parseInt(jtf_num2.getText())  > max  ) {
			max = Integer.parseInt(jtf_num2.getText());
		}
		
		jtf_result.setText(max+"");
	}

}







