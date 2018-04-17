package com.eimt.onlinestore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 11-Apr-18
 */
@Data
@Entity
@Table(name = "manufacturers")
public class Manufacturer extends BaseEntity {
}
