package com.szahch.pojo;

/**
 * 用户信息
 * 
 * @author AlexZHOU 2017.9.20
 *
 */
public class User {

	// private String[] groups;
	//
	// private String[] actions;

	private int id;

	private String name;

	private String username;

	private String password;

	public User() {

	}

	// public String[] getGroups() {
	// return groups;
	// }
	//
	// public void setGroups(String[] groups) {
	// this.groups = groups;
	// }
	//
	// public String[] getActions() {
	// return actions;
	// }
	//
	// public void setActions(String[] actions) {
	// this.actions = actions;
	// }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
}