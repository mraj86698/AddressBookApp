package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.Dto.UserLoginDto;
import com.example.demo.Dto.UserRegisterDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String emailId;
	private String password;
	public User(UserRegisterDto userRegisterDto) {
		this.userName = userRegisterDto.getUserName();
		this.emailId = userRegisterDto.getEmailId();
		this.password = userRegisterDto.getPassword();
	}
	public User(UserLoginDto userLoginDto) {
		this.userName = userLoginDto.getUserName();
		this.password = userLoginDto.getPassword();
	}



}
