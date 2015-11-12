package org.shujito.socialbox.controllers;

import org.shujito.socialbox.Message;

import javax.ws.rs.WebApplicationException;

/**
 * @author Alberto Ramos, 11/12/15.
 */
public class WebException extends WebApplicationException {
	private static final long serialVersionUID = -3109789266465805877L;
	public final Message message;

	public WebException(String response, int status) {
		super(response, status);
		this.message = new Message(false, status, response);
	}
}
