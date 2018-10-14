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
	@NotBlank
	private String qr_code;	
	private Date date_of_birth;	
	private Long mobile_no;	
	private Date activated_date;	
	private String addressLine1;	
	private String addressLine2;	
	private String landmark;	
	private String city;
	private String pincode;
	
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
	
	public String getQr_code() {
		return qr_code;
	}
	
	public void setQr_code(String qr_code) {
		this.qr_code = qr_code;
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
	
	public Date getActivated_date() {
		return activated_date;
	}
	
	public void setActivated_date(Date activated_date) {
		this.activated_date = activated_date;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}
	
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	public String getLandmark() {
		return landmark;
	}
	
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPincode() {
		return pincode;
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}	
}
