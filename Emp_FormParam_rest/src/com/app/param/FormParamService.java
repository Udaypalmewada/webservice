package com.app.param;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/emp")
public class FormParamService {
	@POST
	@Path("/save")
	public Response save(@FormParam("id") int id, @FormParam("name") String name, @FormParam("email") String email) {
		return Response.status(2000)
				.entity(" Employee added successfuly!<br> Id: " + id + "<br> Name: " + name + "<br> email: " + email)
				.build();
	}
}
