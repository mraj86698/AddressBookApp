package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.Dto.ContactDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class ContactData {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int contactId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String pin;
	private String phoneNo;
    private String email;

    public ContactData(ContactDto contactDto){
        this.firstName = contactDto.getFirstName();
        this.lastName = contactDto.getLastName();
        this.address = contactDto.getAddress();
        this.city = contactDto.getCity();
        this.state = contactDto.getState();
        this.pin = contactDto.getPin();
        this.phoneNo = contactDto.getPhoneNo();
        this.email = contactDto.getEmail();
    }
    public void updateContactData(ContactDto contactDto) {

    	this.firstName = contactDto.getFirstName();
        this.lastName = contactDto.getLastName();
        this.address = contactDto.getAddress();
        this.city = contactDto.getCity();
        this.state = contactDto.getState();
        this.pin = contactDto.getPin();
        this.phoneNo = contactDto.getPhoneNo();
        this.email = contactDto.getEmail();

    }

}
