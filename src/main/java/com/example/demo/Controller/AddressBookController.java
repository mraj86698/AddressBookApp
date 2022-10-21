package com.example.demo.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ContactDto;
import com.example.demo.Dto.ResponseDto;
import com.example.demo.Model.ContactData;
import com.example.demo.Service.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

	@Autowired
	IAddressBookService addressBookService;


	@RequestMapping(value = { "", "/welcome" })
	public String welcomeMessage() {
		return addressBookService.getWelcomeMessage();
	}
	/**
	 * Request Mapping Using To Get All Contact Details
	 * @return
	 */
    @RequestMapping(value = {"", "/", "/getAll"})
    public ResponseEntity<ResponseDto> getEmployeePayrollData()
    {
        List<ContactData> contactDataList = null;
        contactDataList = addressBookService.getContactData();
        ResponseDto respDTO = new ResponseDto("Get Call Success", contactDataList);
        return new ResponseEntity<ResponseDto> (respDTO, HttpStatus.OK);
    }
    @GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDto>getContactById(@PathVariable("contactId") int contactId){
		ContactData contactData=null;
		contactData = addressBookService.getContactById(contactId);
		ResponseDto	 responseDTO = new ResponseDto("Get Call Success", contactData);
		return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDto> saveDataIntoDataBase( @Valid @RequestBody ContactDto contactDTO) {
		ContactData contactData = null;
		contactData = addressBookService.createContactData(contactDTO);
		ResponseDto	 responseDTO = new ResponseDto("Contact Data Created SuccessFully", contactData);
		return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
	}
	@PutMapping("/update/{contactId}")
	public ResponseEntity<ResponseDto> updateContactData(@PathVariable int contactId,@Valid @RequestBody ContactDto contactDto){
		ContactData contactData=null;
		contactData=addressBookService.UpdateContactData(contactId,contactDto);
		ResponseDto responseDto=new ResponseDto("Contact Data Updated SuccesssFully",contactData);
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDto> deleteContactById(@PathVariable int contactId){
		addressBookService.deleteContactById(contactId);
		ResponseDto respDTO = new ResponseDto("Contact Data Deleted Successfully ", contactId);
        return new ResponseEntity<ResponseDto> (respDTO, HttpStatus.OK);
	}






}