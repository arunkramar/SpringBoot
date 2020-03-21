package com.arun.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.application.models.Contact;
import com.arun.application.repos.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public Contact createContact(Contact contact) {
		Contact savedContact = contactRepository.save(contact);
		return savedContact;
	}

	@Override
	public List<Contact> readAllContacts() {
		List<Contact> contacts = contactRepository.findAll();
		return contacts;
	}

	@Override
	public Contact editContact(Contact contact) {
		Contact savedContact = contactRepository.save(contact);
		return savedContact;
	}

	@Override
	public void deleteContact(Long id) {
		Contact contact = contactRepository.findById(id).get();
		contactRepository.delete(contact);

	}

	@Override
	public Contact findContact(Long id) {
	
			Contact contact = contactRepository.findById(id).get();
			return contact;
	
		
	}




}
