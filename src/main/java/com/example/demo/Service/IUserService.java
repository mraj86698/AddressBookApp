package com.example.demo.Service;

import com.example.demo.Dto.UserRegisterDto;
import com.example.demo.Model.User;

public interface IUserService {

	User createUserRegister(UserRegisterDto userRegistrationDTO);


	User userLoginAccount(String userName, String password);
	//User UserLoginAccount(UserLoginDto userLoginDto);

}
