package com.code.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.entity.Product;

@Repository
public interface IDao extends JpaRepository<Product, Integer> {

	public Product getByName(String p);
}
