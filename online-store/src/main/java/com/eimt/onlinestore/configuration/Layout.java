package com.eimt.onlinestore.configuration;

import java.lang.annotation.*;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 11-Apr-18
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Layout {
	String NONE = "none"; // no layout will be used

	String value();
}