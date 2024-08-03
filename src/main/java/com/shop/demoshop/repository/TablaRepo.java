package com.shop.demoshop.repository;

import org.springframework.stereotype.Repository;

import com.shop.demoshop.models.Tabla;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TablaRepo extends JpaRepository<Tabla, Integer>{
    public Tabla findbyId(int id); 
}
