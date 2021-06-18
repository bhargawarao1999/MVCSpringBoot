package com.vm.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController 
{
	@RequestMapping("/books/{id}/{course}")
	public String hello(@PathVariable("id") String id, @PathVariable("course") String course)
	{
		return "hello "+id+" "+course;
	}
}
