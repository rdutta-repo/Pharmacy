package com.example.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "single_user")
public class UserBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "user_id", nullable = false)
	private long user_Id;
	
	@Column(name = "f_Name", nullable = false)
	@NotBlank(message = "f_Name is mandatory")
	private String f_Name;
	
	@Column(name = "l_Name", nullable = false)
	@NotBlank(message = "l_Name is mandatory")
	private String l_Name;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "mobile", nullable = false)

	private Long mobile;
	
	@Column(name = "email_Id", nullable = false)
	@NotBlank(message = "email_Id is mandatory")
	private String email_Id;

//	public Integer getUser_Id() {
//		return user_Id;
//	}

//	public void setUser_Id(Integer user_Id) {
//		this.user_Id = user_Id;
//	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}
	
	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}

	@Override
	public String toString() {
		return "UserBean [user_Id=" + user_Id + ", f_Name=" + f_Name + ", l_Name=" + l_Name + ", address=" + address
				+ ", mobile=" + mobile + ", email_Id=" + email_Id + "]";
	}

//	public UserBean(Integer user_Id, @NotBlank(message = "F_Name is mandatory") String f_Name,
//			@NotBlank(message = "L_Name is mandatory") String l_Name, String address, Long mobile,
//			@NotBlank(message = "Email is mandatory") String email_Id) {
//		super();
//		this.user_Id = user_Id;
//		this.f_Name = f_Name;
//		this.l_Name = l_Name;
//		this.address = address;
//		this.mobile = mobile;
//		this.email_Id = email_Id;
//	}
	
}