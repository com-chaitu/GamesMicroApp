package com.chaitu.games.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Entity(name="games_login_info")
public class LoginInfoDao {
	
	@Id
	@NotBlank
	private String user_id;
	@NotBlank
	private String encoded_password;
	private String last_login;
	private Date expiry_date;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEncoded_password() {
		return encoded_password;
	}
	public void setEncoded_password(String encoded_password) {
		this.encoded_password = encoded_password;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
}
