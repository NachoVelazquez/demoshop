package com.shop.demoshop.services;

import com.shop.demoshop.models.Dureza;
import com.shop.demoshop.models.Ruedas;
import com.shop.demoshop.repository.RuedasRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;


@Service
@Transactional
public class RuedasService {

    @Autowired
    private RuedasRepo ruedasRepo;

    public List<Ruedas> findAll(){
        return ruedasRepo.findAll();
    }

    public Ruedas save(final Ruedas ruedas) {
        Assert.notNull(ruedas,"la ruedas no debe ser null");
        return this.ruedasRepo.save(ruedas);
    }

    public void delete(final Ruedas ruedas) {
        Assert.notNull(ruedas, "la ruedas no debe ser null");
        Assert.isTrue(ruedas.getId_rueda() != 0,"Las ruedas que se desea eliminar no esta registrado");
        Assert.isTrue(this.ruedasRepo.existsById(ruedas.getId_rueda()),"Las ruedas no existe");

        this.ruedasRepo.delete(ruedas);
    }


    public List<Ruedas> findByMedida(int medida){
        List<Ruedas> ruedas;

        Assert.isTrue(medida>0, "La Ruedas no puede tener valores negativos");
        ruedas = this.ruedasRepo.findByMedida(medida);

        return ruedas;
    }

    public List<Ruedas> findByDureza(Dureza dureza){
        List<Ruedas> ruedas;
        Assert.notNull(dureza,"la dureza no debe ser null");
        ruedas = this.ruedasRepo.findByDureza(dureza);
        return ruedas;
    }

}
