package org.koushik.javabrains.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MyResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		return "It works!";
	}
	
}
