package com.product.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.crud.model.Product;

public interface CrudRepo extends JpaRepository<Product, Integer>{

}
