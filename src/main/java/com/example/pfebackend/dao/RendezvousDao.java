package com.example.pfebackend.dao;

import com.example.pfebackend.bean.Rendezvous;
import com.example.pfebackend.bean.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RendezvousDao extends JpaRepository<Rendezvous, Long> {

    List<Rendezvous> findAll();

}
