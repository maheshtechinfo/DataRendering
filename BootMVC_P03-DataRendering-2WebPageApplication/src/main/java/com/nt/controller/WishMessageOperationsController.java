package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageOperationsController {
	@Autowired
	private IWishMessageService wishMessageService;

	@RequestMapping("/")
	public String showHomepage() {
		System.out.println("WishMessageOperationsController.showHomepage()");
		// return LVN
		return "welcome";
	}

	@RequestMapping("/season")
	public String showWishMessage(Map<String, Object> map) {
		// use service
		String msg = wishMessageService.wishMessage();

		// keep the result in shared memory as model attributes
		map.put("resultMsg", msg);
		// return LVN
		return "display";
	}
}
