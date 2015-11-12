package org.shujito.socialbox.controllers;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Alberto Ramos, 11/12/15.
 */
@Path("/login")
@Singleton
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_HTML)
public class LoginController {
	public static final String TAG = LoginController.class.getSimpleName();

	@GET
	public Response get() throws Exception {
		//return Response.ok("welcome").build();
		throw new WebException("Not available", Response.Status.NOT_IMPLEMENTED.getStatusCode());
	}

	@POST
	public Response post() throws Exception {
		throw new WebException("Not available", Response.Status.NOT_IMPLEMENTED.getStatusCode());
	}
}
