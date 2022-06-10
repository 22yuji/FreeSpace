package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;

@Repository
public class PgProductDao implements ProductDao {
	
	private static final String SELECT_ALL = "SELECT * FROM products";
	
	@Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Product> findAll() {
		String sql = SELECT_ALL ;
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Product>(Product.class));
	}

}
