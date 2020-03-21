package com.arun.application.services;

import java.util.List;
import com.arun.application.models.Contact;

public interface ContactService {
	
	public Contact createContact(Contact contact);
	public List<Contact> readAllContacts();
	public Contact editContact(Contact contact);
	public void deleteContact(Long id);
	public Contact findContact(Long id);
}
