package com.example.pfebackend.ws;

import com.example.pfebackend.bean.ListePrincipale;
import com.example.pfebackend.service.ListePrincipaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/listePrincipale")
public class ListePrincipaleWs {
    @Autowired
    private ListePrincipaleService listePrincipaleService;

    public List<ListePrincipale> findAll() {
        return listePrincipaleService.findAll();
    }
}
