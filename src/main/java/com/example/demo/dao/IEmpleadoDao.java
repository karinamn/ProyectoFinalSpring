package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado,Long>{

}
