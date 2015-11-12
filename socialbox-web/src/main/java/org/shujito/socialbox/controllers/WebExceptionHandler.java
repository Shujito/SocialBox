package org.shujito.socialbox.controllers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Alberto Ramos, 11/12/15.
 */
@Provider
public class WebExceptionHandler implements ExceptionMapper<WebException> {
	public static final String TAG = WebExceptionHandler.class.getSimpleName();

	@Override
	public Response toResponse(WebException exception) {
		// TODO: format error page
		return Response.status(exception.message.status).entity(exception.message.message).build();
	}
}
