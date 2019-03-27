package com.itbank.model.repository;

import java.util.List;

import com.itbank.model.domain.Member;

public interface MemberDAO {
	public int insert(Member member);
	public List selectAll();
	public Member select(int member_id);
	public int update(Member member);
	public int delete(int member_id);
}
