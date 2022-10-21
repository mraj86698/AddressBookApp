package com.example.demo.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContactDto {

	 @NotEmpty(message = "First name cannot be empty")
	    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First name Invalid")
	    private String firstName;
	    @NotEmpty(message = "Last name cannot be empty")
	    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Last name Invalid")
	    private String lastName;
	    @NotEmpty(message = "phone number cannot be empty")
	    @Pattern(regexp = "^[6789]{1}[0-9]{9}$", message = "MobileNumber is Invalid")
	    private String phoneNo;
	    @Email(message = "Email is not valid",regexp="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	    @NotEmpty(message = "Email cannot be empty")
	    private String email;
	    @NotEmpty(message = "Address cannot be empty")
	    private String address;
	    @NotEmpty(message = "City cannot be empty")
	    private String city;
	    @NotEmpty(message = "State cannot be Empty")
	    private String state;
	    @Size(min = 6,max = 6, message = "Pin code must be of 6 digits")
	    private String pin;

}
