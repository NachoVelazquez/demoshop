package com.shop.demoshop.services;

import java.util.Collection;
import org.springframework.util.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.demoshop.models.Tabla;
import com.shop.demoshop.repository.TablaRepo;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class TablaService {

    @Autowired
    private TablaRepo tablaRepo;

    public Collection<Tabla> findAll(){
        return tablaRepo.findAll();
    }

    public Tabla save(final Tabla tabla) {
        Assert.notNull(tabla, "la tabla no debe ser null");
        return this.tablaRepo.save(tabla);
    }

    public void delete(final Tabla tabla) {
        Assert.notNull(tabla, "la tabla no debe ser null");
        Assert.isTrue(tabla.getId() != 0);
        Assert.isTrue(this.tablaRepo.exists(tabla.getId()));

        this.tablaRepo.delete(tabla);
    }


}
