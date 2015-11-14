package org.shujito.socialbox.controllers;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Alberto Ramos, 11/13/15.
 */
@Provider
public class ExceptionHandler implements ExceptionMapper<Exception> {
	@Override
	public Response toResponse(Exception exception) {
		StringWriter sw = new StringWriter();
		exception.printStackTrace(new PrintWriter(sw));
		return Response
			.status(Response.Status.INTERNAL_SERVER_ERROR)
			.entity("<pre>" + exception.getMessage() + "</pre><hr><pre>" + sw.toString() + "</pre>")
			.build();
	}
}
