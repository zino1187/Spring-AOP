package com.itbank.model.service;

import java.util.List;

import com.itbank.model.domain.Body;
import com.itbank.model.domain.Member;

public interface MemberService{
	public void insert(Member member, Body body);
	public List selectAll();
	public Member select(int member_id);
	public void update(Member member);
	public void delete(int member_id);
}
