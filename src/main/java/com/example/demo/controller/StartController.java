package com.example.demo.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.javaBean.Student;
import com.example.demo.service.StudentService;

/**
 * first
 * 
 * @author wjcshd
 *
 */

@RestController
@RequestMapping("/index")
public class StartController {

	@Autowired
	private StudentService studentService;
	Log Logger = LogFactory.getLog(StartController.class);

	@RequestMapping("/go")
	public String index() {
		Logger.info("已经进入！");
		return "我爱你妈！不礼貌";
	}

	@GetMapping("/list")
	public List<Student> getList() {
		Logger.info("获取集合！");
		return studentService.getStudent();
	}

}
