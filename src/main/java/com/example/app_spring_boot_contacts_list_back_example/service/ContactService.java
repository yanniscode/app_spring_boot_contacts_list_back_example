package com.example.app_spring_boot_contacts_list_back_example.service;

import com.example.app_spring_boot_contacts_list_back_example.model.Contact;
import com.example.app_spring_boot_contacts_list_back_example.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    public Optional<Contact> updateContact(Contact contactToUpdate) {
        return contactRepository.findById(contactToUpdate.getId())
                .map(contact -> contactRepository.save(contactToUpdate)
                );
    }
}
