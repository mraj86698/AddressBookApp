package com.example.demo.Model;

import com.example.demo.Dto.UserDto;

import lombok.Data;
@Data
public class User {
	private int userId;
	private String userName;
	private String emailId;
	private String password;
	public User(UserDto userDto) {
		this.userName = userDto.getUserName();
		this.emailId = userDto.getEmailId();
		this.password = userDto.getPassword();
	}



}
