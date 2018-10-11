package com.hzit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

	@GetMapping("/product")
	@ResponseBody
	public Integer product(Integer productId){
		System.out.println(productId);
		return productId;
	}
}
