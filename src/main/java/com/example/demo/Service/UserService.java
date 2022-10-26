package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserLoginDto;
import com.example.demo.Dto.UserRegisterDto;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Utility.AddressBookUtility;

@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepo;
	@Autowired
    AddressBookUtility addressBookUtility;

	@Override
	public String createUserRegister(UserRegisterDto userRegisterDto) {
		User user = new User(userRegisterDto);
		userRepo.save(user);
		String token = addressBookUtility.createToken(user.getUserId());
        return token;
	}

	 @Override
	    public Optional<User> userLoginAccount(UserLoginDto userLoginDTO) {
	        Optional<User> userData = userRepo.checkUserLogin(userLoginDTO.getUserName(), userLoginDTO.getPassword());
	        if(userData.isPresent()){
	            return userData;
	        }
	        else
	            return null;
	    }

}
