package com.shop.demoshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.shop.demoshop.models.Ejes;
import com.shop.demoshop.models.Marcas;
import com.shop.demoshop.repository.EjesRepository;

@Service
@Transactional
public class EjesService {

    @Autowired
    private EjesRepository ejesRepository;

    public List<Ejes> findAll(){
        return ejesRepository.findAll();
    }

    public Ejes save(final Ejes ejes) {
        Assert.notNull(ejes, "los ejes no debe ser null");
        return this.ejesRepository.save(ejes);
    }

    public void delete(final Ejes ejes) {
        Assert.notNull(ejes, "los ejes no debe ser null");
        Assert.isTrue(ejes.getId_eje() != 0,"Los ejes que se desea eliminar no esta registrado");
        Assert.isTrue(this.ejesRepository.existsById(ejes.getId_eje()),"Los ejes no existen");
        this.ejesRepository.delete(ejes);
    }

    public List<Ejes> findByAnchura(float anchura){
        List<Ejes> ejes;

        Assert.isTrue(anchura>0, "Los ejes no pueden tener una anchura negativa");
        ejes = this.ejesRepository.findByAnchura(anchura);

        return ejes;
    }

    public List<Ejes> findByMaterial(String material){
        List<Ejes> ejes;

        Assert.hasText(material, "Los ejes deben tener materiales");
        ejes = this.ejesRepository.findByMaterial(material);

        return ejes;
    }

    public List<Ejes> findByMarca(Marcas marca){
        Assert.notNull(marca,"No tiene ningún valor marca");

        List<Ejes> ejes = this.ejesRepository.findByMarca(marca);

        return ejes;
    }

    public List<Ejes> findbyColor(String color){
        Assert.hasText(color, "Tiene que tener algun carácter para buscar por color");

        List<Ejes> ejes = this.ejesRepository.findbyColor(color);

        return ejes;
    }
}
