package com.proyecto.proyecto.entity;

public class Usuario {
	
	private String id_user;
	private String name;
	private String lastname;
	private String username;
	private String id_profile;
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId_profile() {
		return id_profile;
	}
	public void setId_profile(String id_profile) {
		this.id_profile = id_profile;
	}
	@Override
	public String toString() {
		return "Usuario [id_user=" + id_user + ", name=" + name + ", lastname=" + lastname + ", username=" + username
				+ ", id_profile=" + id_profile + "]";
	}
	
	

}
