package org.shujito.socialbox.controllers;

import org.shujito.socialbox.Template;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Alberto Ramos, 11/13/15.
 */
@Path(SignInController.ROUTE)
@Singleton
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_HTML)
public class SignInController {
	public static final String ROUTE = "signin";

	@GET
	public Response get() throws Exception {
		return Response.ok(Template.render("signin.jade")).build();
	}

	@POST
	public Response post(
		@FormParam("username") String username,
		@FormParam("email") String email,
		@FormParam("password") String password,
		@FormParam("confirm") String confirm
	) throws Exception {
		return Response.ok(Template.render("signin.jade")).build();
		//throw new WebException("username:" + username, Response.Status.NOT_IMPLEMENTED.getStatusCode());
	}
}
