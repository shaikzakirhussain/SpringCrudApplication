package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.model.Product;

import jakarta.transaction.Transactional;

@Component
public class Dao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	private Product product;
	
	//creating products
	@Transactional
	public void  createProduct(Product product)
	{
		this.hibernateTemplate.save(product);
	}

	//get the products
	public List<Product> getProducts()
	{
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products; 
	}
	
	//delete single product
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class,pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get single product
	
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
}
