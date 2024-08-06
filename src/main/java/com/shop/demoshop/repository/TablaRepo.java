package com.shop.demoshop.repository;

import org.springframework.stereotype.Repository;

import com.shop.demoshop.models.Tabla;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface TablaRepo extends JpaRepository<Tabla, Integer>{

    @Query("select t from Tabla t where t.anchura=:anchura")
    public List<Tabla> findByAnchura(@Param("anchura") float anchura);

    @Query("select t from Tabla t where t.material=:material")
    public List<Tabla> findByMaterial(@Param("material") String material);

    @Query("select t from Tabla t where t.isFibraVidrio =:isFibraVidrio")
    public List<Tabla> findByVidrio(@Param("isFibraVidrio") boolean isFibraVidrio);
}
