/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.Boot.ECommerceBoot.service;

import com.spring.Boot.ECommerceBoot.entities.Category;
import com.spring.Boot.ECommerceBoot.entities.State;
import com.spring.Boot.ECommerceBoot.repository.CategoryRepository;
import com.spring.Boot.ECommerceBoot.repository.CountryRepository;
import com.spring.Boot.ECommerceBoot.repository.StateRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CategoryService {
   @Autowired
private CategoryRepository CategoryRepository  =null;

    public CategoryRepository getCategoryRepository() {
        return CategoryRepository;
    }

    public void setCategoryRepository(CategoryRepository CategoryRepository) {
        this.CategoryRepository = CategoryRepository;
    }


    public List<Category> listAllCategory() {
       List<Category> findAll = CategoryRepository.findAll();
        for (Category category : findAll) {
            System.out.println(category.getCategoryId()); 
        }
        return findAll;
    }

    public Category getCategoryById(Integer id) {
       Category orElseThrow = CategoryRepository.findById(id).orElseThrow(null);
        return orElseThrow;
    }

 
  
  
}
