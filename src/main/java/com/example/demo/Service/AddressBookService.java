package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.ContactDto;
import com.example.demo.Exception.AddressBookException;
import com.example.demo.Model.ContactData;
import com.example.demo.Repository.AddressBookRepository;
@Service
public class AddressBookService implements IAddressBookService{
	@Autowired
    AddressBookRepository addressBookRepo;

	@Override
	    public String getWelcomeMessage() {
	        return "Welcome to Address Book Application";
	    }
	@Override
    public ContactData createContactData(ContactDto contactDTO) {
        ContactData contactData = null;
        contactData = new ContactData(contactDTO);
        return addressBookRepo.save(contactData);
    }

	@Override
	public ContactData UpdateContactData(int contactId,ContactDto contactDto) {
		ContactData contactData=this.getContactById(contactId);
		contactData.updateContactData(contactDto);
		return addressBookRepo.save(contactData);
	}

	@Override
	public ContactData getContactById(int contactId) {
		return addressBookRepo.findById(contactId).orElseThrow(()-> new AddressBookException("Contact with "+contactId+"does not exists"));
	}
	@Override
	public void deleteContactById(int contactId) {
		addressBookRepo.deleteById(contactId);
	}
	@Override
	public List<ContactData> getContactData() {

		return addressBookRepo.findAll();
	}
}
