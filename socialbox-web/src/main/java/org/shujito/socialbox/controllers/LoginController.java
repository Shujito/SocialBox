package org.shujito.socialbox.controllers;

import org.shujito.socialbox.Template;

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
@Path(LoginController.ROUTE)
@Singleton
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_HTML)
public class LoginController {
	public static final String ROUTE = "login";

	@GET
	public Response get() throws Exception {
		return Response.ok(Template.render("login.jade")).build();
	}

	@POST
	public Response post() throws Exception {
		throw new WebException("Not available", Response.Status.NOT_IMPLEMENTED.getStatusCode());
	}
}
