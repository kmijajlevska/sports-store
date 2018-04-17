package com.eimt.onlinestore.service.impl;

import com.eimt.onlinestore.model.Product;
import com.eimt.onlinestore.repository.jpa.ProductJpaRepository;
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
@Profile("jpa")
public class ProductService implements IProductService {

	@Autowired
	private ProductJpaRepository productJpaRepository;

	@Override
	public Optional<Product> findById(Long id) {
		return productJpaRepository.findById(id);
	}

	@Override
	public Collection<Product> findAll() {
		return productJpaRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return productJpaRepository.save(product);
	}

	@Override
	public List<Product> findByCategoryId(Long id) {
		return productJpaRepository.findByCategory(id);
	}

	@Override
	public List<Product> findByManufacturerNameLike(String name) {
		return productJpaRepository.findByManufacturerNameLike(name);
	}

	public List<Product> findByManufacturerId(Long id){
		return productJpaRepository.findByManufacturerId(id);
	}
}
