package com.itbank.model.service;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.itbank.common.exception.RegistFailException;
import com.itbank.model.domain.Body;
import com.itbank.model.domain.Member;
import com.itbank.model.repository.BodyDAO;
import com.itbank.model.repository.MemberDAO;

public class MemberServiceTrans implements MemberService {
	private MemberDAO memberDAO;
	private BodyDAO bodyDAO;
	private TransactionTemplate transactionTemplate;

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public void setBodyDAO(BodyDAO bodyDAO) {
		this.bodyDAO = bodyDAO;
	}

	@Override
	public void insert(Member member, Body body) {
		System.out.println("transactionTemplate: " + transactionTemplate);

		transactionTemplate.execute(new TransactionCallback<Object>() {
			public Object doInTransaction(TransactionStatus status) {
				
				int result = memberDAO.insert(member);
				System.out.println("입력후  member_id"+member.getMember_id());
				body.setMember(member);
				int result2 = bodyDAO.insert(body);

				if (result == 0 || result2 == 0) {
					throw new RegistFailException("등록 실패");
				}
				return null;
			}
		}); // 트랜잭션 시작 & doInTransaction 메서드 호출

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
