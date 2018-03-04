package com.app.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("home")
public class WelcomeService {
	@Path("message")
	@GET
	public String sayHello(){
		return "Hai How r u";
	}
	

}
