package com.bit.exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DigitToKor extends JFrame implements ActionListener {
	
	JTextField jtf_num;
	JTextField jtf_result;
	
	public DigitToKor() {
		jtf_num = new JTextField(5);
		jtf_result = new JTextField(5);
		
		setLayout(new FlowLayout());
		
		add(new JLabel("���� �Է��ϼ���"));
		add(jtf_num);
		
		JButton btn = new JButton("�ѱ� ��ȯ");
		add(btn);
		
		btn.addActionListener(this);
		
		add(new JLabel("���"));
		add(jtf_result);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(jtf_num.getText());
		
		String str[] = {"��","��","��","��","��","��","��","ĥ","��","��"};
		
		String kor = str[n];
		jtf_result.setText(kor);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DigitToKor();
	}

}
