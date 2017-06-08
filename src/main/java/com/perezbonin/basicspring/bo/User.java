package com.perezbonin.basicspring.bo;

import javax.websocket.Encoder.Binary;

public class User {
	private int id;
	private String name;
	private String surname;
	private String email;
	private Binary passwordEncoded;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getEmail() {
		return email;
	}
	public Binary getPasswordEncoded() {
		return passwordEncoded;
	}
	
		
	
}
