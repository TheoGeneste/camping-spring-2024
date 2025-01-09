package com.example.demo.repository;

import com.example.demo.models.Echeance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcheanceRepository extends JpaRepository<Echeance, Integer> {
}