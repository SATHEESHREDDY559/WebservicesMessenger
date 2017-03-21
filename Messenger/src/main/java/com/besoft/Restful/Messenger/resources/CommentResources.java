package com.besoft.Restful.Messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class CommentResources {
	@GET
	public String test(){
		System.out.println("sub test test");
		return "New sub Resources";
	}
	@GET
@Path("/{commentid}")
	public String test2(){
		return "new test2";
	}

}
