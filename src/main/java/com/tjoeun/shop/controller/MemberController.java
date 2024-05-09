package com.tjoeun.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemberController {

	@GetMapping("/member/signin")
	public String singin() {
		log.info(">>>>>>>>>>>>>>>> signin");
		return "singin";
	}

}
