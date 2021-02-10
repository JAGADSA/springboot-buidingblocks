package com.stacksimplify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
//controller
@RestController
public class HelloWorldController {
	//simple method
	//URL -/helloworld
	//GETmethod
	//(we can use this method also)@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("/hellobuddy")
	public String helloworld() {
		
		return"hello jaggu";
		
	}
	
@GetMapping("/hellobuddybean")
	public UserDetails userdetailsBean() {
		return new UserDetails("jagadish" ,"Babu","Hyderabad");
	}
}
