package com.spring.Boot.ECommerceBoot.controllers;



import com.spring.Boot.ECommerceBoot.entities.Category;
import com.spring.Boot.ECommerceBoot.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
@CrossOrigin("http://localhost:4200")
public class CategoryController {
@Autowired
  private CategoryService categoryService=null;

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    
   
    @GetMapping(value = "/findCategoryList")
    public List<Category> getCategoryData() {
        List<Category> listAllProducts = categoryService.listAllCategory();
        return listAllProducts;
    }
    @GetMapping(value = "/categoryDataById/{id}")
    public Category getCategoryByIdData(@PathVariable("id")int Id) {
        Category findCategoryById = categoryService.getCategoryById(Id);
        return findCategoryById;
    }
  
}
