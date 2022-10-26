package com.example.demo.Service;

import com.example.demo.Dto.UserLoginDto;
import com.example.demo.Dto.UserRegisterDto;
import com.example.demo.Model.User;

public interface IUserService {

	User createUserRegister(UserRegisterDto userRegistrationDTO);

	User userLoginAccount(UserLoginDto userLoginDto);

}
