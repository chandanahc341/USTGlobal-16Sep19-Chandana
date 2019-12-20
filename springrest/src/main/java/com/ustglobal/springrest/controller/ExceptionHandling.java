package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ustglobal.springrest.dto.EmployeeResponse;

public class ExceptionHandling {
	@ExceptionHandler(Exception.class)
	public ExceptionHandling getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(122);
		response.setMessage("error in code");
		response.setDescription("exception occured");
		return null;
	}

}
