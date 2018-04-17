package com.eimt.onlinestore.web.rest;

import com.eimt.onlinestore.exceptions.EntityNotFoundException;
import com.eimt.onlinestore.model.Category;
import com.eimt.onlinestore.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author Kristina
 * @email kristina.mijajlevska@singular.uk
 * @date 17-Apr-18
 */
@RestController
@RequestMapping("/rest/categories")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Category> listAll() {
		return new ArrayList<>(categoryService.findAll());
	}

	@GetMapping(value = "/{id}[\\d+]",
			produces = "application/json")
	public Category findById(@PathVariable(name = "id") Long id) {
		Optional<Category> optCategory = categoryService.findById(id);

		return optCategory
				.orElseThrow(() -> new EntityNotFoundException("No category with id: " + id));
	}


	@GetMapping(value = "/byId",
			produces = "application/json")
	public Category findByIdFromRequest(@RequestParam Long id) {
		Optional<Category> optCategory = categoryService.findById(id);

		return optCategory
				.orElseThrow(() -> new EntityNotFoundException("No category with id: " + id));
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Category create(@RequestBody @Valid Category category) {
		return categoryService.save(category);
	}


}
