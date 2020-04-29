package org.capg.dao;

import java.util.List;

import org.capg.entities.Product;

public interface IProductDao {
	Product findById(int id);
	Product save(Product product);
	List<Product> fetchAll();
	boolean remove(int id);
	

}
