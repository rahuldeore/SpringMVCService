/**
 * 
 */
package com.rahul.helloservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rahuldeore
 *
 */

@Controller
public class AppController {
	
	@RequestMapping("/welcome")
	public ModelAndView hello() {
		return new ModelAndView("welcome", "message", "Hello from Rahul !") ;
	}

}
