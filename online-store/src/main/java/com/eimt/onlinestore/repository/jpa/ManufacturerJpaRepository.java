package com.eimt.onlinestore.repository.jpa;

import com.eimt.onlinestore.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
public interface ManufacturerJpaRepository extends JpaRepository<Manufacturer, Long>{
}
