package com.javarevolutions.jsps.servlets.vo;

import java.io.Serializable;

public class VOLogin implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7775167431914195386L;
	private String name;
	private String user;
	private Integer age;
	public String getUser() {
		return user;
	}
	public String getName() {
		return name;
	}
	public void setName(String nombre) {
		this.nombre = name;
	}
	public void setUser(String usuario) {
		this.usuario = user;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer edad) {
		this.edad = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;

}
