package com.tjoeun.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/member/signin")
	public String singin() {
		return "singin";
	}

}
