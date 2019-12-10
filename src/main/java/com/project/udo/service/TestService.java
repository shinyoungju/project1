package com.project.udo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.udo.service.dao.TestDao;
import com.project.udo.vo.TestVo;

public class TestService {

	@Autowired
	TestDao dao;
	
	public List<TestVo> findAllNotice() {
		List<TestVo> testvolist = dao.selectAll();
		return testvolist;
	}
	
}
