package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	@Query(value = "select * from user where user_name = :userName and password = :password",nativeQuery = true)

	Optional<User> checkUserLogin(String userName, String password);
}
