package com.eimt.onlinestore.repository.jpa;

import com.eimt.onlinestore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
public interface CategoryJpaRepository extends JpaRepository<Category, Long>{

	List<Category> findByName(String name);
}
