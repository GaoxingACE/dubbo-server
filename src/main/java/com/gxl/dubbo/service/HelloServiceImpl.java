package com.gxl.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String s) {
		// TODO Auto-generated method stub
		return "hello"+s;
	}

}
