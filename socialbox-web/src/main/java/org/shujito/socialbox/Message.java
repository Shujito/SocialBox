package org.shujito.socialbox;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alberto Ramos, 11/12/15.
 */
public class Message {
	public static final String SUCCESS = "success";
	public static final String STATUS = "status";
	public static final String MESSAGE = "message";
	@SerializedName(SUCCESS)
	public final boolean success;
	@SerializedName(STATUS)
	public final int status;
	@SerializedName(MESSAGE)
	public final String message;

	public Message(boolean success, int status, String message) {
		this.success = success;
		this.status = status;
		this.message = message;
	}
}
