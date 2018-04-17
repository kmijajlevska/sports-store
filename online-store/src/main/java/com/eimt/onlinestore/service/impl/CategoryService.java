package com.eimt.onlinestore.service.impl;

import com.eimt.onlinestore.model.Category;
import com.eimt.onlinestore.repository.jpa.CategoryJpaRepository;
import com.eimt.onlinestore.service.ICategoryService;
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
public class CategoryService implements ICategoryService{

	@Autowired
	private CategoryJpaRepository categoryJpaRepository;

	@Override
	public Optional<Category> findById(Long id) {
		return categoryJpaRepository.findById(id);
	}

	@Override
	public Collection<Category> findAll() {
		return categoryJpaRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		return categoryJpaRepository.save(category);
	}
}
