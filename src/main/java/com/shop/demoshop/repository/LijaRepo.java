package com.shop.demoshop.repository;

import com.shop.demoshop.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LijaRepo extends JpaRepository<Lija, Integer>{

    @Query("select l from Lija l where l.marcas=:marcas")
    public List<Lija> findByMarcas(@Param("marcas") Marcas marcas);

    @Query("select l from Lija l where l.abrasion=:abrasion")
    public List<Lija> findByAbrasion(@Param("abrasion") Abrasion abrasion);

}
