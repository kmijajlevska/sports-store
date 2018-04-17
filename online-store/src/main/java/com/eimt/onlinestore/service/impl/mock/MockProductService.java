package com.eimt.onlinestore.service.impl.mock;

import com.eimt.onlinestore.model.Product;
import com.eimt.onlinestore.repository.mock.impl.MockProductRepository;
import com.eimt.onlinestore.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
@Service
@Profile("mock")
public class MockProductService implements IProductService {

	@Autowired
	private MockProductRepository productRepository;

	@Override
	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public Collection<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> findByCategoryId(Long id) {
		return null;
	}

	@Override
	public List<Product> findByManufacturerNameLike(String name) {
		return null;
	}
}
