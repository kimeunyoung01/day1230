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
		
		setTitle("숫자 알아 맞추기");
		
		add(new JLabel("알아 맞추어 보세요:"));
		add(jtf_user);
		btn = new JButton("맞추기");
		add(btn);
		
		JButton btn_reTry = new JButton("다시시도");
		add(btn_reTry);
		btn_reTry.addActionListener(this);
		
		
		btn.addActionListener(this);
		
		JButton btn_finish = new JButton("종료");
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
		if(cmd.equals("맞추기"))
		{
			int user = Integer.parseInt(jtf_user.getText());
			if(com == user) {
				jlb_msg.setText("알아 맞추었습니다.");
				//jlb_msg.setBackground(Color.blue);
				
			}else if(com > user) {
				jlb_msg.setText("더 큰수를 시도하세요");
				//jlb_msg.setBackground(Color.red);
		
			}else {
				jlb_msg.setText("더 작은 수를 시도하세요");
				//jlb_msg.setBackground(Color.red);
			}
			
			cnt++;
			if(cnt >= 5) {
				btn.setEnabled(false);
			}

			jlb_cnt.setText(cnt+"번 시도했습니다.");
		}else if( cmd.equals("종료")) {
			System.exit(0);
		}else if(cmd.equals("다시시도")) {
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





