package org.jsp.springmvcpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {
		return "<h1>This handler method is created to test the Configuration</h1>";
	}

	@RequestMapping(value = "/open-view")
	public String openView(@RequestParam(name = "view") String view) {
		return view;
	}

	@RequestMapping("/sum")
	public String findSum(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + "+" + n2 + "=" + (n1 + n2);
		model.addAttribute("res", result);
		return "print";
	}

	@RequestMapping("/diff")
	public String findDifference(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + "-" + n2 + "=" + (n1 - n2);
		model.addAttribute("res", result);
		return "print";
	}

	@RequestMapping("/prod")
	public String findProduct(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + "*" + n2 + "=" + (n1 * n2);
		model.addAttribute("res", result);
		return "print";
	}

	@RequestMapping("/quotient")
	public String findQuotient(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + "/" + n2 + "=" + (n1 / n2);
		model.addAttribute("res", result);
		return "print";
	}

	@RequestMapping("/rem")
	public String findReminder(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + "%" + n2 + "=" + (n1 % n2);
		model.addAttribute("res", result);
		return "print";
	}
}
