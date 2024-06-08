package org.jsp.springmvcpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {
	 return "<h1>This handler method is created to test the Configuration</h1>";
	}
}
