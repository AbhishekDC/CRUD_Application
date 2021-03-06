package com.product.crud.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.crud.model.Product;
import com.product.crud.services.CrudService;

@RestController
public class CrudRestController {
	
	@Autowired
	private CrudService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path = "/getproductlist", method = RequestMethod.GET)
	public List<Product> fetchProductList(){
		List<Product> products= new ArrayList<Product>();
		//Logic to fetch List from Database
		products = service.fetchProductList();
		return products;
	}
	@CrossOrigin(origins = "http://localhost:4200")	
	@RequestMapping(path = "/addproduct", method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product) {
		
		return service.saveProducttoDb(product);
	}
	
	@RequestMapping(path = "/getproductbyid/{id}", method = RequestMethod.GET)
	public Product fetchProductByID(@PathVariable Integer id) {
		return service.fetchProductbyID(id).get();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(path = "/deleteproductbyid/{id}")
	public String deleteProductbyId(@PathVariable Integer id) {
		
		return service.deleteProductbyId(id);
	}

}
