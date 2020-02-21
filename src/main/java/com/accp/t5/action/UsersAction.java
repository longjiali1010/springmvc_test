package com.accp.t5.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.t5.vo.Users;

@Controller
@RequestMapping("/c/members")
public class UsersAction {

	private final List<Users> data = new ArrayList<Users>();
	{
		data.add(new Users(100, "admin", "123"));
		data.add(new Users(101, "sa", "456"));
		data.add(new Users(102, "test", "789"));
	}

	@GetMapping("loginIn")
	public String loginIn(Users users, HttpSession session, Model model) throws Exception {
		System.out.println("第一次修改");
		System.out.println("第二次修改");
		for (Users temp : data) {
			if (temp.getUserName().equals(users.getUserName()) && temp.getUserPwd().equals(users.getUserPwd())) {
				session.setAttribute("USERS", temp);
				return "redirect:/c/members/index";
			}
		}
		model.addAttribute("MSG", "用户名或密码错误");
		return "../../login";
	}

}
