package com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

	 public static void main(String[]args) {
		 ApplicationContext contex = new ClassPathXmlApplicationContext("c");
	 }
}
