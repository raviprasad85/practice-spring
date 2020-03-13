package com.vns.ravi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/*@RequestMapping("/hello")*/
public class HelloWorldController {
	
	
	   @RequestMapping(method = RequestMethod.GET)
	   public String sayHelloWorld(ModelMap model) {
	     model.addAttribute("message", "Spring 3.0 MVC Framework Hello World Example");
	     model.addAttribute("auther", "ravi prasad");
	     return "hello";
	   }
 
 /*  @RequestMapping(method = RequestMethod.GET)
   public String sayHelloWorld(Model model) {
     model.addAttribute("message", "Spring 3.0 MVC Framework Hello World Example");
     model.addAttribute("auther", "DineshOnJava");
     return "hello";
   }*/
	/*@RequestMapping(value= {"/","/home","index"})
	public ModelAndView sayHelloWorld() {
		ModelAndView mv=new ModelAndView("hello");
		mv.addObject("message", "Spring 3.0 MVC Framework Hello World Example");
		mv.addObject("auther", "Ravi");
		return mv;
	}*/
	
}