package com.example.pfebackend.ws;

import com.example.pfebackend.bean.Contact;
import com.example.pfebackend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactWs {
    @Autowired
    private ContactService contactService;

    @GetMapping("/reference/{reference}")
    public Contact findByReference(@PathVariable String reference) {
        return contactService.findByReference(reference);
    }

    @GetMapping("nom/{nom}")
    public Contact findByNom(@PathVariable String nom) {
        return contactService.findByNom(nom);
    }

    @GetMapping("/ville/{ville}")
    public List<Contact> findByVille(@PathVariable String ville) {
        return contactService.findByVille(ville);
    }

    @GetMapping("/qualite/{qualite}")
    public List<Contact> findByByQualite(@PathVariable String qualite) {
        return contactService.findByByQualite(qualite);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return contactService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<Contact> findAll() {
        return contactService.findAll();
    }
    @PostMapping("/contact/{contact}")
    public int save(Contact contact) {
        return contactService.save(contact);
    }
}
