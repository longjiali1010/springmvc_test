package com.accp.t5.action;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accp.t5.vo.Users;

@Controller   //【非常重要】
@RequestMapping("/api/users")
public class ContentNegotiationAction {
	
	@GetMapping
	public String getContentNegotiationView(Model model) {
		//Model model：多视图数据渲染
		Users users=new Users(10000,"admin", "123");
		users.getRoles().add("超级管理员");
		users.getRoles().add("普通管理员");
		model.addAttribute("DATA",users);//序列化json字符串
		return "Users";//jsp名称，xml序列化时实体名称
	}
}
