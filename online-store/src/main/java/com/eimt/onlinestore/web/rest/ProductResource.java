package com.eimt.onlinestore.web.rest;

import com.eimt.onlinestore.model.Product;
import com.eimt.onlinestore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
@RestController
@RequestMapping("/rest/products")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> listAll() {
		return new ArrayList<>(productService.findAll());
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Product> importAll(@RequestBody @Valid ArrayList<Product> products) {
		for (Product product : products) {
			productService.save(product);
		}
		return products;
	}

	@RequestMapping(method = RequestMethod.GET, value = "categories/{id}")
	public List<Product> findByCategory(@PathVariable("id") Long id) {
		return productService.findByCategoryId(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "manufacturers/{name}")
	public List<Product> findByManufacturerNameLike(@PathVariable("name") String name){
		return productService.findByManufacturerNameLike(String.format("%%%s%%", name));
	}

}
