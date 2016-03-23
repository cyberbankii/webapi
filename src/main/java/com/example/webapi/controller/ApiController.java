package com.example.webapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.webapi.model.Employee;

@Controller
@RequestMapping("/api")
public class ApiController {

	@RequestMapping(value = "/list", method = RequestMethod.GET, headers = {
			"Accept=application/json" }, produces = { "application/json" })
	@ResponseBody
	public Employee list() {
		return new Employee();
	}
}
