package com.shop.demoshop.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.demoshop.models.Tabla;
import com.shop.demoshop.repository.TablaRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TablaService {

    private TablaRepo tablaRepo;

    @Autowired
    public TablaService(TablaRepo tablaRepo){
        this.tablaRepo = tablaRepo;
    }

    public Collection<Tabla> findAll(){
        return tablaRepo.findAll();
    }
}
