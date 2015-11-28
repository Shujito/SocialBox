package org.shujito.socialbox.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alberto Ramos, 11/14/15.
 */
public class User {
	@SerializedName("_id")
	private final String id;
	@SerializedName("email")
	private final String email;
	@SerializedName("username")
	private final String username;
	@SerializedName("display_name")
	private final String displayName;

	public User(String email, String username, String displayName) {
		this.id = null;
		this.email = email;
		this.username = username;
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public String getUsername() {
		return this.username;
	}

	public String getEmail() {
		return this.email;
	}

	public String getId() {
		return this.id;
	}
}
