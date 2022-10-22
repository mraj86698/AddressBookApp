package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserRegisterDto;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService implements IUserService{
	@Autowired
	UserRepository userRepo;

	@Override
	public User createUserRegister(UserRegisterDto userRegisterDto) {
		User user=null;
		user=new User(userRegisterDto);
		return userRepo.save(user);
	}

//	public User UserLoginAccount(UserLoginDto userLoginDto) {
//		return userRepo.checkUserLogin(userLoginDto);
//    }

	@Override
	    public User userLoginAccount(String userName, String password) {
	        return userRepo.checkUserLogin(userName,password);
	    }


}
