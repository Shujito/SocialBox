package org.shujito.socialbox;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.ErrorHandler;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

/**
 * @author Alberto Ramos, 11/12/15.
 */
public class ControllerErrorHandler extends ErrorHandler {
	public static final String TAG = ControllerErrorHandler.class.getSimpleName();

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException {
		baseRequest.setHandled(true);
		response.setHeader("content-type", MediaType.TEXT_HTML);
		response.getWriter().write("bad request:" + response.getStatus());
	}
}
