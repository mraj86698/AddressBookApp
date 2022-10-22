package com.example.demo.Dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data

public class UserRegisterDto {

	@NotEmpty(message = "UserName name cannot be empty")
    @Pattern(regexp = "^[A-Za-z][A-Za-z0-9_]{7,29}$", message = "User Name Invalid")
	private String userName;
	 //@Email(message = "Email is not valid",regexp="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	 @NotEmpty(message = "Email cannot be empty")
	private String emailId;
	 //@Pattern(regexp="[A-Z]+[a-z]{5,}+[0-9]+[*.!@#$%^&(){}[]:;<>,.?/~_+-=|\\]",message = "Password is not valid")
	 @NotEmpty(message = "Password cannot be empty")
	 private String password;
}
