package com.shop.demoshop.repository;

import com.shop.demoshop.models.Dureza;
import com.shop.demoshop.models.Ruedas;
import com.shop.demoshop.models.Tabla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RuedasRepo extends JpaRepository<Ruedas, Integer>{

    @Query("select r from Ruedas r where r.medida=:medida")
    public List<Ruedas> findByMedida(@Param("medida") int medida);

    @Query("select r from Ruedas r where r.dureza=:medida")
    public List<Ruedas> findByDureza(@Param("dureza") Dureza dureza);

}
