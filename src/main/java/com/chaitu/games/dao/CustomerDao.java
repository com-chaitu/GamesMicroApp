package com.chaitu.games.dao;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name="games_customer")
public class CustomerDao {
	
	@Id
	@NotBlank
	private String user_id;
	
	@NotBlank
	private String first_name;
	
	@NotBlank
	private String last_name;
	
	private Date date_of_birth;
	
	private Long mobile_no;
	
	@NotBlank
	private String address;
	
	private Date activated_date;
	
	@NotBlank
	private String qr_code;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(Long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getActivated_date() {
		return activated_date;
	}

	public void setActivated_date(Date activated_date) {
		this.activated_date = activated_date;
	}

	public String getQr_code() {
		return qr_code;
	}

	public void setQr_code(String qr_code) {
		this.qr_code = qr_code;
	}
	
	
}
