package com.dzkj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj.mapper.UserMapper;
import com.dzkj.pojo.Users;

@Controller
public class ShowController {
	@Autowired
	UserMapper um;
	@RequestMapping("/login")
	public String login(String name,String pwd){
		Users u = new Users();
		u.setUzname(name);
		u.setPwd(pwd);
		Users users = um.selectOne(u);
		System.out.println(name);
		System.out.println(pwd);
		System.out.println(u);
		if(users!=null) {
			return "home/home";
		}else {
			return "home/login";
		}
	}
	@RequestMapping("/action")
	public String action() {
		return "home/login";
	}
}
