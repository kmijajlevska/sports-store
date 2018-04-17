package com.eimt.onlinestore.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 11-Apr-18
 */
@Data
@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
}
