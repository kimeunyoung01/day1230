package com.bit.exam03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame implements ActionListener {
	
	int op1;
	int op2;
	String op;
	
	
	JTextField display;
	String []arr = {
			"1","2","3","+",
			"4","5","6","-",
			"7","8","9","*",
			"0","c","=","/"
			};
	JButton btn[];
	
	public Calc() {
		
		//������� ��Ÿ�� �ؽ�Ʈ�ʵ�
		display = new JTextField(10);
		
		//���� ��ư 16���� ��� ���� �г��� �����ؿ�.
		JPanel p = new JPanel();
		p.setBackground(Color.yellow);
		
		
		//��ü �������� ���̾ƿ��� BorderLayout�� �����ϰ�
		//ȭ���� ���� ������� ǥ����  display�� ����
		//ȭ���� ����� ���� ��ư�� �ִ� �г��� ����.
		setLayout(new BorderLayout());
		
		btn = new JButton[arr.length];
		p.setLayout(new GridLayout(4, 4));
		for(int i=0; i<arr.length;i++) {
			btn[i] = new JButton(arr[i]);
			p.add(btn[i]);
			btn[i].addActionListener(this);
		}
		
		
		
		add(display, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*")  || cmd.equals("/")) {
			op1 = Integer.parseInt(display.getText());
			op = cmd;
			display.setText("");
		}else if(cmd.equals("=")) {
			op2 = Integer.parseInt(display.getText());
			
			int r = 0;
			switch(op) {
				case "+":r = op1 + op2;break;
				case "-":r = op1 - op2;break;
				case "*":r = op1 * op2;break;
				case "/":r = op1 / op2;break;
			}
			display.setText(r+"");
		}else if(cmd.equals("c")) {
			op1 = 0;
			op2 = 0;
			display.setText("");
		}else {
			display.setText(  display.getText() + cmd  );
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calc();
	}

}
