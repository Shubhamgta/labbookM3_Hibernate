package org.capg.service;

import java.util.List;

import org.capg.entities.Product;

public interface IProductService {
	Product findById(int id);
	Product save(Product product);
	List<Product> fetchAll();
	boolean remove(int id);
}
