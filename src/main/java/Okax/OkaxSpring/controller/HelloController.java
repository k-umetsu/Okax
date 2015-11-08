package Okax.OkaxSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Okax.OkaxSpring.definition.OkaxProperty;

@Controller
public class HelloController implements OkaxProperty {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return PROJECT_NAME;
	}
}
