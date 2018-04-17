package com.eimt.onlinestore.repository.mock;

import com.eimt.onlinestore.model.Product;
import com.eimt.onlinestore.repository.BaseRepository;
import org.springframework.context.annotation.Profile;

import java.util.List;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 11-Apr-18
 */
@Profile("jpa")
public interface IMockProductRepository extends BaseRepository<Product, Long> {


}
