package com.itbank.model.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.BeanNameAware;

import com.itbank.model.domain.Body;

public class MybatisBodyDAO implements BodyDAO, BeanNameAware{
	private SqlSessionTemplate sessionTemplate;

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}

	public int insert(Body body) {
		return sessionTemplate.insert("Body.insert", body);
	}

	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Body select(int body_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Body body) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int body_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setBeanName(String name) {
		System.out.println(this.sessionTemplate+"저 방금 태어나서 이름 받앗네요 감동 ㅜㅜ "+ name);
		
	}
}
