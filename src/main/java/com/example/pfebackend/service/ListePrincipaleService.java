package com.example.pfebackend.service;

import com.example.pfebackend.bean.ListePrincipale;
import com.example.pfebackend.dao.ListePrincipaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListePrincipaleService {
    @Autowired
    private ListePrincipaleDao listePrincipaleDao;

    public List<ListePrincipale> findAll() {
        return listePrincipaleDao.findAll();
    }
}
