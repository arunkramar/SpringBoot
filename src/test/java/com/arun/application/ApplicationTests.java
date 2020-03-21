package com.arun.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arun.application.models.Contact;
import com.arun.application.services.ContactService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ContactService contactService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreateContact() {
		
		Contact contact =new Contact();
		
		contact.setFirstName("Jason");
		contact.setLastName("Schubring");
		contact.setEmail("jasons@gmail.com");
		contact.setCity("GreenBay");
		contact.setCountry("USA");
		
		Contact createdContact = contactService.createContact(contact);
		System.out.println(createdContact);
	}
	
	@Test
	public void testCreateAnotherContact() {
		
		Contact contact =new Contact();
		
		contact.setFirstName("Anand");
		contact.setLastName("Ulaganathan");
		contact.setEmail("anandu@onwardpath.com");
		contact.setCity("GreenBay");
		contact.setCountry("USA");
		
		Contact createdContact = contactService.createContact(contact);
		System.out.println(createdContact);
	}
	
	@Test
	public void testEditContact() {
		
		Contact contact =contactService.findContact(1L);
		contact.setCellPhone("9204418778");
		Contact editedContact = contactService.editContact(contact);
		System.out.println(editedContact);
	}
	
	@Test
	public void testDeleteContact() {
		contactService.deleteContact(2L);
	}

}
