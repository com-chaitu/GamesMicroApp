package com.chaitu.games.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.validation.constraints.NotBlank;

@Entity(name = "games_customer")
@SecondaryTable(name = "games_login_info", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_id"))
public class CustomerDao {

	@Id
	@NotBlank
	@Column(table = "games_customer")
	private String user_id;

	@NotBlank
	@Column(table = "games_customer")
	private String first_name;

	@NotBlank
	@Column(table = "games_customer")
	private String last_name;

	@NotBlank
	@Column(table = "games_customer")
	private String qr_code;

	@Column(table = "games_customer")
	private Date date_of_birth;

	@Column(table = "games_customer")
	private Long mobile_no;

	@Column(table = "games_customer")
	private Date activated_date;

	@Column(table = "games_customer")
	private String addressLine1;

	@Column(table = "games_customer")
	private String addressLine2;

	@Column(table = "games_customer")
	private String landmark;

	@Column(table = "games_customer")
	private String city;

	@Column(table = "games_customer")
	private String pincode;

	@NotBlank
	@Column(table = "games_login_info")
	private String encoded_password;

	@Column(table = "games_login_info")
	private Date last_login;

	@Column(table = "games_login_info")
	private Date expiry_date;

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

	public String getEncoded_password() {
		return encoded_password;
	}

	public void setEncoded_password(String encoded_password) {
		this.encoded_password = encoded_password;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

}
