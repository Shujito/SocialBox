package org.shujito.socialbox.controllers.api;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Alberto Ramos, 11/12/15.
 */
@Path("/")
@Singleton
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ApiController {
	public static final String TAG = ApiController.class.getSimpleName();

	@GET
	public Response index() throws Exception {
		return Response.ok("{}").build();
	}
}
