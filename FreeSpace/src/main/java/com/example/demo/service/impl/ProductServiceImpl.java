package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
    private ProductDao productDao;
	
	@Override
	public List<Product> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return productDao.findAll();
	}
	
}
