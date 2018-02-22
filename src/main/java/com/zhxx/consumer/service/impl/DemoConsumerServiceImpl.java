package com.zhxx.consumer.service.impl;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhxx.consumer.service.DemoConsumerService;
import com.zhxx.pojo.Student;
import com.zhxx.service.DemoService;

public class DemoConsumerServiceImpl implements DemoConsumerService {

	@Reference
	private DemoService demoService;

	@Override
	public List<Student> findAll() {

		return demoService.selAll();
	}

}
