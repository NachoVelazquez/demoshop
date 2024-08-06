package com.shop.demoshop.services;

import java.util.List;

import org.springframework.util.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.demoshop.models.Tabla;
import com.shop.demoshop.repository.TablaRepo;



@Service
@Transactional
public class TablaService {

    @Autowired
    private TablaRepo tablaRepo;

    public List<Tabla> findAll(){
        return tablaRepo.findAll();
    }

    public Tabla save(final Tabla tabla) {
        Assert.notNull(tabla, "la tabla no debe ser null");
        return this.tablaRepo.save(tabla);
    }

    public void delete(final Tabla tabla) {
        Assert.notNull(tabla, "la tabla no debe ser null");
        Assert.isTrue(tabla.getId() != 0,"La tabla que se desea eliminar no esta registrado");
        Assert.isTrue(this.tablaRepo.existsById(tabla.getId()),"La tabla no existe");
        this.tablaRepo.delete(tabla);
    }


    public List<Tabla> findByAnchura(float anchura){
        List<Tabla> tablas;

        Assert.isTrue(anchura>=0, "La Tabla no puede tener valores negativos");
        tablas = this.tablaRepo.findByAnchura(anchura);

        return tablas;
    }

    public List<Tabla> findByMaterial(String material){
        List<Tabla> tablas;

        Assert.hasText(material, "La Tabla Tiene materiales");
        tablas = this.tablaRepo.findByMaterial(material);

        return tablas;
    }

    public List<Tabla> findByisFibradeVidrio(boolean isFibraVidrio){
        List<Tabla> tablas;

        tablas = this.tablaRepo.findByVidrio(isFibraVidrio);

        return tablas;
    }


}
