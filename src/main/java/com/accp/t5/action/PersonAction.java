package com.accp.t5.action;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t5.vo.Users;

@RestController
@RequestMapping("/api/persons")
public class PersonAction {

	private final List<Users> data = new ArrayList<Users>();
	{
		data.add(new Users(100, "admin", "123"));
		data.add(new Users(101, "sa", "456"));
		data.add(new Users(102, "test", "789"));
	}

	@GetMapping
	public List<Users> query() throws Exception {
		return data;
	}

}
