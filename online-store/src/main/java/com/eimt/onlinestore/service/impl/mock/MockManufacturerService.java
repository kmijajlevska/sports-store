package com.eimt.onlinestore.service.impl.mock;

import com.eimt.onlinestore.model.Manufacturer;
import com.eimt.onlinestore.repository.mock.impl.MockManufacturerRepository;
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
@Profile("mock")
public class MockManufacturerService implements IManufacturerService {

	@Autowired
	private MockManufacturerRepository manufacturerRepository;

	@Override
	public Optional<Manufacturer> findById(Long id) {
		return manufacturerRepository.findById(id);
	}

	@Override
	public Collection<Manufacturer> findAll() {
		return manufacturerRepository.findAll();
	}

	@Override
	public Manufacturer save(Manufacturer manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}
}
