package com.shop.demoshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shop.demoshop.models.Ejes;
import com.shop.demoshop.models.Marcas;


@Repository
public interface EjesRepository extends JpaRepository<Ejes,Integer>{

     @Query("select e from Ejes e where e.anchura=:anchura")
    public List<Ejes> findByAnchura(@Param("anchura") float anchura);

    @Query("select e from Ejes e where e.material=:material")
    public List<Ejes> findByMaterial(@Param("material") String material);

    @Query("select e from Ejes e where e.marca=:marca")
    public List<Ejes> findByMarca(@Param("marca") Marcas marca);

    @Query("select e from Ejes e where e.color=:color")
    public List<Ejes> findbyColor(@Param("color") String color);
}
