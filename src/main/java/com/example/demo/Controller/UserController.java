package com.example.demo.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ResponseDto;
import com.example.demo.Dto.UserLoginDto;
import com.example.demo.Dto.UserRegisterDto;
import com.example.demo.Model.User;
import com.example.demo.Service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
    IUserService userService;

	@PostMapping("/register")
	public ResponseEntity<ResponseDto> registerAccount( @Valid @RequestBody UserRegisterDto userRegistrationDTO){

        String token = userService.createUserRegister(userRegistrationDTO);
        ResponseDto responseDTO = new ResponseDto("User has been registered",token);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
	 @GetMapping("/login")
	    public ResponseEntity<ResponseDto> UserLoginAccount(@RequestBody UserLoginDto userLoginDto){
		 Optional<User> userData = null;
	        userData = userService.userLoginAccount(userLoginDto);
	        ResponseDto responseDTO = new ResponseDto("Account Successfully Logged In",userData);
	        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	    }

}
