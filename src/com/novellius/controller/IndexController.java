package com.novellius.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("resultado")
public class IndexController {

	
	@RequestMapping("/")
	public String showIndex(Model model){
		model.addAttribute("resultado", "Resultado desde Session");
		return "index";
	}

	@RequestMapping("/about")
	public String showABout(SessionStatus sessionStatus){
		sessionStatus.setComplete();
		return "about";
	}

	
}
