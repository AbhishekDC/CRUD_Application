package com.product.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Product;
import com.product.crud.repo.CrudRepo;

@Service  	
public class CrudService {
	
	@Autowired
	private CrudRepo repo;
	
	public List<Product> fetchProductList(){
		return repo.findAll();
	}
	
	public Product saveProducttoDb(Product product) {
		return repo.save(product);	
	}
	
	public Optional<Product> fetchProductbyID(Integer id) {
		return repo.findById(id);	
	}
	
	public String deleteProductbyId(Integer id) {
		String result;
		try {
			repo.deleteById(id);
			result="Product Successfully Deleted.";
		}catch (Exception e) {
			e.printStackTrace();
			result="Product Not Deleted";
		}
		return result;
		
	}
	
}
