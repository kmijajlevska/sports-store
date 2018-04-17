package com.eimt.onlinestore.web.controllers;

import com.eimt.onlinestore.configuration.Layout;
import com.eimt.onlinestore.model.Category;
import com.eimt.onlinestore.model.Product;
import com.eimt.onlinestore.service.impl.CategoryService;
import com.eimt.onlinestore.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
@Controller
public class LandingController {

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	@Layout("layout/master")
	@GetMapping("/")
	public String index(Model model, @RequestParam(required = false, defaultValue = "World") String helloTo) {
		List<Category> categories = new ArrayList<>(categoryService.findAll());
		List<Product> products = new ArrayList<>(productService.findAll());

		model.addAttribute("categories", categories);
		model.addAttribute("helloTo", helloTo);
		model.addAttribute("products", products);
		return "index";
	}

	// todo if an error occurs, change path to categories instead
	@GetMapping("/category/{id}")
	public String categoryItems(Model model, @PathVariable Long id) {
		Optional<Category> optCategory = categoryService.findById(id);

		Category noCategory = new Category();
		noCategory.setName("No category with id: " + id);

		model.addAttribute("category", optCategory.orElse(noCategory));
		return "category";
	}

	@GetMapping("/products/{id}")
	public String productView(Model model, @PathVariable("id") Long id) {
		Optional<Product> product = productService.findById(id);
		model.addAttribute("product", product.orElse(null));
		return "product";
	}
}
