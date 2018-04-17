package com.eimt.onlinestore.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 11-Apr-18
 */
@Data
@Entity
@Table(name = "products")
public class Product extends BaseEntity {

	@Column(name = "description")
	private String description;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "is_in_stock")
	private boolean isInStock;

	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;

	@ManyToOne(fetch = FetchType.EAGER)
	private Manufacturer manufacturer;
}
