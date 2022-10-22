package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	@Query(value = "select * from user where user_name = :userName and password = :password",nativeQuery = true)
    User checkUserLogin(String userName, String password);
	//User checkUserLogin(UserLoginDto userLoginDto);
}
