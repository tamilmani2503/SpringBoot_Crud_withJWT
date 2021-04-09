package com.microcredential.userservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

/**
 * @author 
 *
 */
@Entity
@Table (name="user")
public class User {

	@Id
	private Integer userId;
	
	@Column(name ="member_name")
	private String name;
	@Column(name ="display_name")
	private String displayName;
	@Column(name ="dateofBirth")
	private String dateOfBirth;
	@Column(name ="citizen")
	private String citizenship;
	@Column(name ="gender")
	private String gender;
	@Column(name ="martial_status")
	private String martialStatus;
	@Column(name ="ssnnumber")
	private String ssn_number;
	@Column(name ="email")
	private String emailAddress;
	@Column(name ="phone_number")
	private String phoneNumber;
	@Column(name ="guardian_type")
	private String guardianType;
	@Column(name ="guardian_name")
	private String guardianName;
	@Column(name ="blood_group")
	private String bloodType;
	@Column(name ="address")
	private String address;
	@Column(name ="country")
	private String country;
	@Column(name ="state")
	private String state;
	@Column(name ="timezone")
	private String timezone;
	@Column(name ="user_name")
	private String userName;
	@Column(name ="password")
	private String password;
	
	@CreationTimestamp
	private Date created;
	
	
	
	public User() {
		super();
		
	}
	public User(Integer userId, String name, String displayName, String dateOfBirth, String citizenship, String gender,
			String martialStatus, String ssn_number, String emailAddress, String phoneNumber, String guardianType,
			String guardianName, String bloodType, String address, String country, String state, String timezone,
			String userName, String password, Date created) {
		super();
		this.userId = userId;
		
		this.name = name;
		this.displayName = displayName;
		this.dateOfBirth = dateOfBirth;
		this.citizenship = citizenship;
		this.gender = gender;
		this.martialStatus = martialStatus;
		this.ssn_number = ssn_number;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.guardianType = guardianType;
		this.guardianName = guardianName;
		this.bloodType = bloodType;
		this.address = address;
		this.country = country;
		this.state = state;
		this.timezone = timezone;
		this.userName = userName;
		this.password = password;
		this.created = created;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	public String getSsn_number() {
		return ssn_number;
	}
	public void setSsn_number(String ssn_number) {
		this.ssn_number = ssn_number;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGuardianType() {
		return guardianType;
	}
	public void setGuardianType(String guardianType) {
		this.guardianType = guardianType;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
	
	


}
