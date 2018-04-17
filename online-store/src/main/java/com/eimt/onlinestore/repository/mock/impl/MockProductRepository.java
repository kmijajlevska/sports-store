package com.eimt.onlinestore.repository.mock.impl;

import com.eimt.onlinestore.model.Product;
import com.eimt.onlinestore.repository.mock.IMockProductRepository;
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
public class MockProductRepository implements IMockProductRepository {

	static Map<Long, Product> products = new HashMap<>();
	static Long idGenerator = 0L;

	@Override
	public Collection<Product> findAll() {
		return products.values();
	}

	@Override
	public Optional<Product> findById(Long id) {
		return Optional.ofNullable(products.get(id));
	}

	@Override
	public Product save(Product product) {
		if (product.getId() == null) {
			product.setId(getNextId());
		}
		return products.put(product.getId(), product);
	}

	private synchronized Long getNextId() {
		return ++idGenerator;
	}
}
