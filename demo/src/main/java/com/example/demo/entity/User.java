package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String email;
	private String password;

	private String address;
	private String mobile;

	@Column(name = "onboard_date")
	private LocalDateTime onboardDate;

	private Integer version;

	@Column(name = "isd_code")
	private String isdCode;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "modified_date")
	private LocalDateTime modifiedDate;

	// Constructors
	public User() {
	}

	public User(String name, String email, String password, String address, String mobile, LocalDateTime onboardDate,
			Integer version, String isdCode, String createdBy, LocalDateTime createdDate, String modifiedBy,
			LocalDateTime modifiedDate) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.mobile = mobile;
		this.onboardDate = onboardDate;
		this.version = version;
		this.isdCode = isdCode;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	// Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDateTime getOnboardDate() {
		return onboardDate;
	}

	public void setOnboardDate(LocalDateTime onboardDate) {
		this.onboardDate = onboardDate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getIsdCode() {
		return isdCode;
	}

	public void setIsdCode(String isdCode) {
		this.isdCode = isdCode;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
