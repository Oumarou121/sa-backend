package com.scorpion.sa.repository;

import com.scorpion.sa.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByEmail(String email);
}
