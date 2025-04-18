package com.auradev.potfoliobackend.services;

import com.auradev.potfoliobackend.models.Contact;
import com.auradev.potfoliobackend.repositories.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}