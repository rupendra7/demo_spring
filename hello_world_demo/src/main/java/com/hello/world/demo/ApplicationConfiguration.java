package com.hello.world.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationConfiguration {
	@RequestMapping("/hello")
	public String helloWithName(@RequestParam(name="name",required=false,defaultValue="world") String name) {
		return "hello : "+name;
	}
}
