package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Contact;
import com.example.pfebackend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactWs {
    @Autowired
    private ContactService contactService;

    public Contact findByReference(String reference) {
        return contactService.findByReference(reference);
    }

    public Contact findByNom(String nom) {
        return contactService.findByNom(nom);
    }

    public List<Contact> findByVille(String ville) {
        return contactService.findByVille(ville);
    }

    public List<Contact> findByByQualite(String qualite) {
        return contactService.findByByQualite(qualite);
    }

    public int deleteByReference(String reference) {
        return contactService.deleteByReference(reference);
    }

    public List<Contact> findAll() {
        return contactService.findAll();
    }

    public int save(Contact contact) {
        return contactService.save(contact);
    }
}
