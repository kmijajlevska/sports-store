package com.eimt.onlinestore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 11-Apr-18
 */
@Entity
@Table(name = "categories")
@Data
public class Category extends BaseEntity {
}
