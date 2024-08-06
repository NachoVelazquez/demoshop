package com.shop.demoshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shop.demoshop.models.Categoria;
import com.shop.demoshop.models.Marcas;
import com.shop.demoshop.models.Rodamientos;

@Repository
public interface RodamientosRepository extends JpaRepository<Rodamientos,Integer>{
    @Query("select r from Rodamientos r where r.categoria=:categoria")
    public List<Rodamientos> findByCategoria(@Param("categoria") Categoria categoria);

    @Query("select r from Rodamientos r where r.marca=:marca")
    public List<Rodamientos> findByMarca(@Param("marca") Marcas marca);

    
}
