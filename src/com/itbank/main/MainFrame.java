package com.itbank.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

import com.itbank.model.domain.Body;
import com.itbank.model.domain.Member;
import com.itbank.model.service.MemberService;

public class MainFrame extends JFrame implements ActionListener{

	private JTextComponent t_id;
	private JTextComponent t_name;
	private JTextComponent t_height;
	private JTextComponent t_weight;
	private JTextComponent t_type;
	
	private JButton bt;
	private MemberService memberService;
	
	public void setT_id(JTextComponent t_id) {
		this.t_id = t_id;
	}
	public void setT_name(JTextComponent t_name) {
		this.t_name = t_name;
	}
	public void setBt(JButton bt) {
		this.bt = bt;
	}
	
	public void setT_height(JTextComponent t_height) {
		this.t_height = t_height;
	}
	public void setT_weight(JTextComponent t_weight) {
		this.t_weight = t_weight;
	}
	public void setT_type(JTextComponent t_type) {
		this.t_type = t_type;
	}
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void init() {
		setLayout(new FlowLayout());
		add(t_id);
		add(t_name);
		add(t_height);
		add(t_weight);
		add(t_type);
		
		add(bt);
		
		setVisible(true);
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		regist();		
	}
	public void regist() {
		Member member =new Member();
		member.setId(t_id.getText());
		member.setName(t_name.getText());
		Body body = new Body();
		body.setHeight(Integer.parseInt(t_height.getText()));
		body.setWeight(Integer.parseInt(t_weight.getText()));
		body.setType(t_type.getText());
		
		try {
			memberService.insert(member ,body);
			JOptionPane.showMessageDialog(this, "등록성공");
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			e.printStackTrace();
		}
	}
}
