/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.Boot.ECommerceBoot.repository;

import com.spring.Boot.ECommerceBoot.entities.Category;
import com.spring.Boot.ECommerceBoot.entities.Products;
import com.spring.Boot.ECommerceBoot.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
