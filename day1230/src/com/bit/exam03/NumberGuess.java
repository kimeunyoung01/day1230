package com.bit.exam03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGuess extends JFrame implements ActionListener {

	int com;
	JTextField jtf_user;
	JTextField jlb_msg;
	JLabel jlb_cnt;
	int cnt = 0;
	JButton btn;
	
	public NumberGuess() {

		jtf_user = new JTextField(5);
		jlb_msg = new JTextField("");
		jlb_cnt = new JLabel("");
		
		Random rand = new Random();
		com =  rand.nextInt(100)  + 1;
		
		setLayout(new FlowLayout());
		
		setTitle("���� �˾� ���߱�");
		
		add(new JLabel("�˾� ���߾� ������:"));
		add(jtf_user);
		btn = new JButton("���߱�");
		add(btn);
		
		JButton btn_reTry = new JButton("�ٽýõ�");
		add(btn_reTry);
		btn_reTry.addActionListener(this);
		
		
		btn.addActionListener(this);
		
		JButton btn_finish = new JButton("����");
		add(btn_finish);
		btn_finish.addActionListener(this);
		
		add(jlb_msg);
		add(jlb_cnt);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();
		if(cmd.equals("���߱�"))
		{
			int user = Integer.parseInt(jtf_user.getText());
			if(com == user) {
				jlb_msg.setText("�˾� ���߾����ϴ�.");
				//jlb_msg.setBackground(Color.blue);
				
			}else if(com > user) {
				jlb_msg.setText("�� ū���� �õ��ϼ���");
				//jlb_msg.setBackground(Color.red);
		
			}else {
				jlb_msg.setText("�� ���� ���� �õ��ϼ���");
				//jlb_msg.setBackground(Color.red);
			}
			
			cnt++;
			if(cnt >= 5) {
				btn.setEnabled(false);
			}

			jlb_cnt.setText(cnt+"�� �õ��߽��ϴ�.");
		}else if( cmd.equals("����")) {
			System.exit(0);
		}else if(cmd.equals("�ٽýõ�")) {
			btn.setEnabled(true);
			cnt = 0;
			Random rand = new Random();
			com = rand.nextInt(100) + 1;
			jlb_cnt.setText("");
			jlb_msg.setText("");
			jtf_user.setText("");
			jlb_msg.setBackground(Color.gray);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberGuess();
	}

}





