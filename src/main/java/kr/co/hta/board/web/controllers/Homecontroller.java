package kr.co.hta.board.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

	@RequestMapping("/home.do")
	public String home() {
		return "home.jsp";
	}
}
