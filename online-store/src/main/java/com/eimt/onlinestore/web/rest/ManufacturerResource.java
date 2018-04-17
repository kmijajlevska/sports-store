package com.eimt.onlinestore.web.rest;

import com.eimt.onlinestore.model.Manufacturer;
import com.eimt.onlinestore.service.impl.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("rest/manufacturers")
public class ManufacturerResource {

	@Autowired
	private ManufacturerService manufacturerService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Manufacturer> listAll(){
		return new ArrayList<>(manufacturerService.findAll());
	}

	@RequestMapping(method = RequestMethod.POST)
	public Manufacturer create(@RequestBody @Valid Manufacturer manufacturer){
		return manufacturerService.save(manufacturer);
	}

}
