package com.user.registration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.persistence.Entity;

//import javax.persistence.Id;

@Entity
@Table
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	private String username;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	@Override
	public String toString() {

		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname

				+ ", lastname=" + lastname + ", email=" + email + "]";

	}

	

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

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

	public String getFirstname() {

		return firstname;

	}

	public void setFirstname(String firstname) {

		this.firstname = firstname;

	}

	public String getLastname() {

		return lastname;

	}

	public void setLastname(String lastname) {

		this.lastname = lastname;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public Users() {

		super();

	}

	public Users(int id, String username, String password, String firstname, String lastname, String email) {

		super();

		this.id = id;

		this.username = username;

		this.password = password;

		this.firstname = firstname;

		this.lastname = lastname;

		this.email = email;

	}

}
