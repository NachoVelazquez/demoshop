package com.shop.demoshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.shop.demoshop.models.Categoria;
import com.shop.demoshop.models.Marcas;
import com.shop.demoshop.models.Rodamientos;
import com.shop.demoshop.repository.RodamientosRepository;


@Service
@Transactional
public class RodamientosService {
    
    @Autowired
    private RodamientosRepository rodamientosRepository;

    public List<Rodamientos> findAll(){
        return this.rodamientosRepository.findAll();
    }

    public Rodamientos save(final Rodamientos rodamientos) {
        Assert.notNull(rodamientos, "la tabla no debe ser null");
        return this.rodamientosRepository.save(rodamientos);
    }

    public void delete(final Rodamientos rodamientos) {
        Assert.notNull(rodamientos, "la rodamientos no debe ser null");
        Assert.isTrue(rodamientos.getId_rodam() != 0,"La rodamientos que se desea eliminar no esta registrado");
        Assert.isTrue(this.rodamientosRepository.existsById(rodamientos.getId_rodam()),"La rodamientos no existe");
        this.rodamientosRepository.delete(rodamientos);
    }

    public List<Rodamientos> findByMarca(Marcas marca){
        Assert.notNull(marca,"No tiene ningún valor marca");

        List<Rodamientos> rodamientos = this.rodamientosRepository.findByMarca(marca);

        return rodamientos;
    }

    public List<Rodamientos> findByCategoria(Categoria categoria){
        Assert.notNull(categoria,"No tiene ningún valor marca");

        List<Rodamientos> rodamientos = this.rodamientosRepository.findByCategoria(categoria);

        return rodamientos;
    }

}
