package org.capg.service;

import java.util.List;

import org.capg.dao.IProductDao;
import org.capg.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements IProductService{
	
	
	private IProductDao productDao;
	

	public IProductDao getProductDao() {
		return productDao;
	}
	@Autowired
	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Product findById(int id) {
		return productDao.findById(id);
	}

	@Override
	public Product save(Product product) {
		return productDao.save(product);
	}

	@Override
	public List<Product> fetchAll() {
		return productDao.fetchAll();
	}

	@Override
	public boolean remove(int id) {
		return productDao.remove(id);
	}

}
