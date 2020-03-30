package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.javaBean.Student;

/**
 * 
 * @author wjcshd
 *
 */
@Mapper
public interface StudentDao {

	List<Student> getList();

}
