package com.example.app_spring_boot_contacts_list_back_example.repository;

import com.example.app_spring_boot_contacts_list_back_example.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
