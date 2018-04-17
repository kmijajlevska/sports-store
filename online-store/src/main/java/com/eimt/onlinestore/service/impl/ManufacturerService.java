package com.eimt.onlinestore.service.impl;

import com.eimt.onlinestore.model.Manufacturer;
import com.eimt.onlinestore.repository.jpa.ManufacturerJpaRepository;
import com.eimt.onlinestore.service.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
@Service
@Profile("jpa")
public class ManufacturerService implements IManufacturerService{

	@Autowired
	private ManufacturerJpaRepository manufacturerJpaRepository;

	@Override
	public Optional<Manufacturer> findById(Long id) {
		return manufacturerJpaRepository.findById(id);
	}

	@Override
	public Collection<Manufacturer> findAll() {
		return manufacturerJpaRepository.findAll();
	}

	@Override
	public Manufacturer save(Manufacturer manufacturer) {
		return manufacturerJpaRepository.save(manufacturer);
	}
}
