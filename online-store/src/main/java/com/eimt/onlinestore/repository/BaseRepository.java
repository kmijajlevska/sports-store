package com.eimt.onlinestore.repository;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
public interface BaseRepository<Entity, Id> {

	Collection<Entity> findAll();

	Optional<Entity> findById(Id id);

	Entity save(Entity entity);
}
