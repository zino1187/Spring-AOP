package com.itbank.model.domain;

public class Body {
	private int body_id;
	private Member member;
	private int height;
	private int weight;
	private String type;
	
	public int getBody_id() {
		return body_id;
	}
	public void setBody_id(int body_id) {
		this.body_id = body_id;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
