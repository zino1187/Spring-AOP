package com.itbank.model.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.BeanNameAware;

import com.itbank.model.domain.Member;

public class MybatisMemberDAO implements MemberDAO,BeanNameAware {
	private SqlSessionTemplate sessionTemplate;
	
	//setter
	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}

	@Override
	public int insert(Member member) {
		return sessionTemplate.insert("Member.insert", member);
	}

	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member select(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int member_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(this.sessionTemplate+"저 방금 태어나서 이름 받앗네요 감동 ㅜㅜ "+ name);
		
	}
	
}
