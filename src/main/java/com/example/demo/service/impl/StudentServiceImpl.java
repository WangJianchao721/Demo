package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.javaBean.Student;
import com.example.demo.service.StudentService;

/**
 * 
 * @author wjcshd
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentDao.getList();
	}

}
