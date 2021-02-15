/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.Boot.ECommerceBoot.service;

import com.spring.Boot.ECommerceBoot.entities.Products;
import com.spring.Boot.ECommerceBoot.entities.State;
import com.spring.Boot.ECommerceBoot.repository.CountryRepository;
import com.spring.Boot.ECommerceBoot.repository.ProductsRepository;
import com.spring.Boot.ECommerceBoot.repository.StateRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository = null;

    public ProductsRepository getProductsRepository() {
        return productsRepository;
    }

    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Products> findProductByCategoryCategoryId(int Id) {
        List<Products> findByCategoryId = productsRepository.findByCategoryCategoryId(Id);
        //List<Products> findByCategoryId = productsRepository.findAll();

        return findByCategoryId;
    }

    public List<Products> listAllProducts() {
        List<Products> findAll = productsRepository.findAll();
        return findAll;
    }

    public List<Products> listProductsByContain(String name) {
        //To change body of generated methods, choose Tools | Templates.
        List<Products> findByNameContaining = productsRepository.findByNameContaining(name);
        return findByNameContaining;
    }

    public Products findProductById(int Id) {
        //To change body of generated methods, choose Tools | Templates.
        Products orElseThrow = productsRepository.findById(Id).orElseThrow(null);
        return orElseThrow;
    }

}
