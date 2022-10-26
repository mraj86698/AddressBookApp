package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.ContactDto;
import com.example.demo.Model.ContactData;

public interface IAddressBookService {
	String getWelcomeMessage();

    ContactData createContactData(ContactDto contactDTO);

	ContactData getContactById(int contactId);

	ContactData UpdateContactData(int contactId, ContactDto contactDto);

	void deleteContactById(int contactId);

	List<ContactData> getContactData();

	List<ContactData> sortContactsBycity();

	List<ContactData> sortContactsByState();

}
