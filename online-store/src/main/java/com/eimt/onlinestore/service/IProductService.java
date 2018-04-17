package com.eimt.onlinestore.service;

import com.eimt.onlinestore.model.Product;

import java.util.List;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
public interface IProductService extends BaseService<Product, Long> {
	List<Product> findByCategoryId(Long id);
	List<Product> findByManufacturerNameLike(String name);
}
