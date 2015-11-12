package org.shujito.socialbox.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Alberto Ramos, 11/12/15.
 */
@Path("login")
public class LoginController {
	public static final String TAG = LoginController.class.getSimpleName();

	@GET
	public Response index() {
		return Response.ok("welcome").build();
	}
}
