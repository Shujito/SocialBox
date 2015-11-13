package org.shujito.socialbox.controllers;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.neuland.jade4j.Jade4J;
import de.neuland.jade4j.template.JadeTemplate;

/**
 * @author Alberto Ramos, 11/12/15.
 */
@Path("/login")
@Singleton
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_HTML)
public class LoginController {
	public static final String TAG = LoginController.class.getSimpleName();
	private final JadeTemplate loginTemplate;

	public LoginController() throws Exception {
		this.loginTemplate = Jade4J.getTemplate("./_templates/login.jade");
	}

	@GET
	public Response get() throws Exception {
		//return Response.ok(Jade4J.render(this.loginTemplate, null)).build();
		return Response.ok(Jade4J.render("./_templates/login.jade", null)).build();
	}

	@POST
	public Response post() throws Exception {
		throw new WebException("Not available", Response.Status.NOT_IMPLEMENTED.getStatusCode());
	}
}
