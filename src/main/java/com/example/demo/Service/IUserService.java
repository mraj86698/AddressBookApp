package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.Dto.UserLoginDto;
import com.example.demo.Dto.UserRegisterDto;
import com.example.demo.Model.User;

public interface IUserService {

	User createUserRegister(UserRegisterDto userRegistrationDTO);


	 Optional<User> userLoginAccount(UserLoginDto userLoginDTO);

}
