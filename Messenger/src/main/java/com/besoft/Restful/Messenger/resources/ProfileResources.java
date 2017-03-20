package com.besoft.Restful.Messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.besoft.Restful.Messenger.model.Profile;
import com.besoft.Restful.Messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class ProfileResources {
	ProfileService ps=new ProfileService();
	@GET
	public List<Profile> getProfiles(){
		return ps.getProfiles();
	}
	@GET
	@Path("/{profileLName}")
	public Profile getProfile(@PathParam("profileLName")String lname){
		return ps.getProfile(lname);
	}
	@POST
	public Profile addProfile(Profile profile){
		return ps.addProfile(profile);
	}
	@PUT
	@Path("/{profileLName}")
	public Profile updateProfile(@PathParam("profileLName") String lname,Profile profile){
		profile.setLname(lname);
		System.out.println(profile);
		Profile p=ps.updateProfile(profile);
		System.out.println(p);
		return p;
	}
	@DELETE
	@Path("/{profileLName}")
	public Profile remove(@PathParam("profileLName") String lname ){
	
		return ps.removeProfile(lname);}
	
}
