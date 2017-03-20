package com.besoft.Restful.Messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/{injected}")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class InjectedClass {
	@GET
	@Path("annotations")
	public String getInjectedMessage(@MatrixParam("param") String str,
									 @HeaderParam("customHeaderValue") String hd,
									 @CookieParam("Cookie") String Cookie){
		return "Matrix"+str+" Header "+hd+"Cookie "+Cookie;
	}
@GET
@Path("context")
public String getMessageContext(@Context UriInfo uri, @Context HttpHeaders header ){
	return "Path: "+uri.getAbsolutePath()+",,"+header.getCookies();
}
}
