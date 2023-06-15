package com.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.IDao;
import com.code.entity.Product;

@Service
public class ProductService {
	@Autowired
	IDao dao;

	public void addProduct(Product p) {
		dao.save(p);
	}

	public Product getProduct(String name) {
		return dao.getByName(name);
	}

	public List<Product> getAllProducts() {
		return dao.findAll();
	}
}
