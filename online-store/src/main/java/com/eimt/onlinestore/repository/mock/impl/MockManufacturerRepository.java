package com.eimt.onlinestore.repository.mock.impl;

import com.eimt.onlinestore.model.Manufacturer;
import com.eimt.onlinestore.repository.mock.IMockManufacturerRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
@Component
@Profile("mock")
public class MockManufacturerRepository implements IMockManufacturerRepository {

	static Map<Long,Manufacturer> manufacturers = new HashMap<>();
	static Long idGenerator = 0L;

	@Override
	public Collection<Manufacturer> findAll() {
		return manufacturers.values();
	}

	@Override
	public Optional<Manufacturer> findById(Long id) {
		return Optional.ofNullable(manufacturers.get(id));
	}

	@Override
	public Manufacturer save(Manufacturer manufacturer) {
		if(manufacturer.getId()==null){
			manufacturer.setId(getNextId());
		}
		return manufacturers.put(manufacturer.getId(), manufacturer);
	}

	private synchronized Long getNextId() {
		return ++idGenerator;
	}
}
