package com.admin.AdminMicroServices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "admin") 
public class Admin {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin")
	@SequenceGenerator(name="admin", sequenceName = "adminseq")
	@Column(name = "id")
	private long id;

	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	public Admin() {
		
	}
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
