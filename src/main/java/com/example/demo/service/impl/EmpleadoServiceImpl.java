package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDao;
import com.example.demo.entity.Empleado;
import com.example.demo.service.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	@Autowired
	public IEmpleadoDao empleadodao;
	@Override
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>) empleadodao.findAll();
	}

}
