package com.itbank.model.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.itbank.model.domain.Member;

public class JdbcMemberDAO implements MemberDAO{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Member member) {
		int member_id=0;
		try {
			String sql="insert into member(member_id,id,name) values(seq_member.nextval,?,?)";
			jdbcTemplate.update(sql, member.getId(), member.getName());
			
			sql="select seq_member.currval as member_id from dual";
			member_id=jdbcTemplate.queryForObject(sql, Integer.class);
			member.setMember_id(member_id);
			System.out.println("member_id °ªÀº "+member_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return member_id; 
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

}
