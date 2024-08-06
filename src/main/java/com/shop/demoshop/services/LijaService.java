package com.shop.demoshop.services;

import com.shop.demoshop.models.Abrasion;
import com.shop.demoshop.models.Lija;
import com.shop.demoshop.models.Marcas;
import com.shop.demoshop.repository.LijaRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;


@Service
@Transactional
public class LijaService {

    @Autowired
    private LijaRepo lijaRepo;

    public List<Lija> findAll(){
        return lijaRepo.findAll();
    }

    public Lija save(final Lija lija) {
        Assert.notNull(lija,"la lija no debe ser null");
        return this.lijaRepo.save(lija);
    }

    public void delete(final Lija lija) {
        Assert.notNull(lija, "la lija no debe ser null");
        Assert.isTrue(lija.getId_lija() != 0,"Las lija que se desea eliminar no esta registrado");
        Assert.isTrue(this.lijaRepo.existsById(lija.getId_lija()),"Las lija no existe");

        this.lijaRepo.delete(lija);
    }


    public List<Lija> findByMarca(Marcas marcas){
        List<Lija> lija;

        Assert.notNull(marcas,"la marca no debe ser null");
        lija = this.lijaRepo.findByMarcas(marcas);

        return lija;
    }

    public List<Lija> findByAbrasion(Abrasion abrasion){
        List<Lija> lija;
        Assert.notNull(abrasion,"la abrasion no debe ser null");
        lija = this.lijaRepo.findByAbrasion(abrasion);
        return lija;
    }

}
