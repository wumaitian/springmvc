package com.springapp.mvc;

import com.ejiaofei.rocketmq.config.ConfigureInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	ConfigureInitializer configureInitializer;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println(configureInitializer.getNamesrvAddr());
		return "hello";
	}
}