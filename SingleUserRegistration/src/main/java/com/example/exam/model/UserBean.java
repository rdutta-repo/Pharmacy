package com.example.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

/* B-V1
 * Removed dead code
 * Removed unused Code as ToString method
 * Added Lombok Plugin
 * */

@Entity
@Table(name = "single_user")
@Getter
@Setter
public class UserBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

		
}