package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	//request mapping : 메소드 단독 맵핑
	@RequestMapping({"/main",""})
	public String main() {
		return "MainController:main()";
	}
	
	@ResponseBody
	//request mapping : 메소드 단독 맵핑
	@RequestMapping("/main/a/b/c/d")
	public String main2() {
		return "MainController:main2()";
	}
}
