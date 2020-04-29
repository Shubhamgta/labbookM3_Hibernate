package org.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.capg.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements IProductDao {
	private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
	@Override
	public Product findById(int id) {
		Product product=entityManager.find(Product.class, id);
		return product;
	}
	@Override
	public Product save(Product product) {
		product=getEntityManager().merge(product);
		return product;
	}
	@Override
	public List<Product> fetchAll() {
		String jql="from Product";
		TypedQuery<Product> query=entityManager.createQuery(jql, Product.class);
		List<Product> list=query.getResultList();
		return list;
	}
	@Override
	public boolean remove(int id) {
		Product product=findById(id);
		entityManager.remove(product);
		return true;
	}

}
