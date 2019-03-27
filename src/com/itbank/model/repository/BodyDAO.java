package com.itbank.model.repository;

import java.util.List;

import com.itbank.model.domain.Body;

public interface BodyDAO {
	public int insert(Body body);
	public List selectAll();
	public Body select(int body_id);
	public int update(Body body);
	public int delete(int body_id);
}
