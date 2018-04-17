package com.eimt.onlinestore.repository.mock.impl;

import com.eimt.onlinestore.model.Category;
import com.eimt.onlinestore.repository.mock.IMockCategoryRepository;
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
public class MockCategoryRepository implements IMockCategoryRepository {

	static Map<Long, Category> categories = new HashMap<>();
	static Long idGenerator = 0L;

	@Override
	public Collection<Category> findAll() {
		return categories.values();
	}

	@Override
	public Optional<Category> findById(Long id) {
		return Optional.ofNullable(categories.get(id));
	}

	@Override
	public Category save(Category category) {
		if (category.getId() == null) {
			category.setId(getNextId());
		}
		return categories.put(category.getId(), category);
	}

	private synchronized Long getNextId() {
		return ++idGenerator;
	}
}
