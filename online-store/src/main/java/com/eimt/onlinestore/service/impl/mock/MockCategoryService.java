package com.eimt.onlinestore.service.impl.mock;

import com.eimt.onlinestore.model.Category;
import com.eimt.onlinestore.repository.mock.impl.MockCategoryRepository;
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
@Profile("mock")
public class MockCategoryService implements ICategoryService{

	@Autowired
	private MockCategoryRepository categoryRepository;

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public Collection<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}
}
