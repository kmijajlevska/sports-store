package com.eimt.onlinestore.repository.jpa;

import com.eimt.onlinestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
public interface ProductJpaRepository extends JpaRepository<Product, Long> {

	List<Product> findByName(String name);

	List<Product> findByManufacturerNameLike(String manufacturer);

	List<Product> findByCategory(Long categoryId);

	List<Product> findByManufacturerId(Long manufacturerId);
}
