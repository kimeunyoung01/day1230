package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumTest extends JFrame implements ActionListener{

	JTextField jtf_num;
	JTextField jtf_result;
	
	public SumTest() {
		jtf_num = new JTextField(5);
		jtf_result = new JTextField(5);
		
		setLayout(new FlowLayout());
		add(new JLabel("어디까지 더할까요"));
		add(jtf_num);
		
		JButton btn = new JButton("더하기");
		add(btn);
		btn.addActionListener(this);
		
		add(new JLabel("결과:"));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(jtf_num.getText());
		int tot = 0;
		for(int i=1; i<= n ; i++) {
			tot += i;
		}
		
		jtf_result.setText(tot + "");
	}

}








