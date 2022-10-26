package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.ContactData;


@Repository
public interface AddressBookRepository extends JpaRepository<ContactData,Integer> {





}
