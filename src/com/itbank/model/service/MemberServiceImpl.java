package com.itbank.model.service;

import java.util.List;

import org.springframework.transaction.support.TransactionTemplate;

import com.itbank.common.exception.RegistFailException;
import com.itbank.model.domain.Body;
import com.itbank.model.domain.Member;
import com.itbank.model.repository.BodyDAO;
import com.itbank.model.repository.MemberDAO;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO;
	private BodyDAO bodyDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	public void setBodyDAO(BodyDAO bodyDAO) {
		this.bodyDAO = bodyDAO;
	}
	
	@Override
	public void insert(Member member, Body body) throws RuntimeException{
		
		try {
			int result=memberDAO.insert(member);
			body.setMember(member);
			int result2=bodyDAO.insert(body);
			
			if(result ==0 || result2==0) {
				throw new RegistFailException("등록 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("시스템적 에러 발생");
		}
		
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
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int member_id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
