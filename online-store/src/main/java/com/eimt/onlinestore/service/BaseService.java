package com.eimt.onlinestore.service;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
public interface BaseService<Entity, Id> {
	Optional<Entity> findById(Id id);

	Collection<Entity> findAll();

	Entity save(Entity entity);
}
