package com.example.pfebackend.service;

import com.example.pfebackend.bean.Contact;
import com.example.pfebackend.dao.ContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactDao contactDao;

    public Contact findByReference(String reference) {
        return contactDao.findByReference(reference);
    }

    public Contact findByNom(String nom) {
        return contactDao.findByNom(nom);
    }

    public List<Contact> findByVille(String ville) {
        return contactDao.findByVille(ville);
    }

    public List<Contact> findByByQualite(String qualite) {
        return contactDao.findByByQualite(qualite);
    }

    public int deleteByReference(String reference) {
        return contactDao.deleteByReference(reference);
    }

    public List<Contact> findAll() {
        return contactDao.findAll();
    }

    public int save(Contact contact) {
        contactDao.save(contact);
        return 1;
    }
}
