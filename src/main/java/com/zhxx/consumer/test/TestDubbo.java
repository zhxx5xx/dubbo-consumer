package com.zhxx.consumer.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhxx.consumer.service.DemoConsumerService;
import com.zhxx.pojo.Student;

public class TestDubbo {

	public static void main(String[] args) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("spring-dubbo.xml");
		DemoConsumerService service = atx.getBean("demoConsumerService",DemoConsumerService.class);
		List<Student> findAll = service.findAll();
		for (Student student : findAll) {
			System.out.println(student);
		}
	}

}
