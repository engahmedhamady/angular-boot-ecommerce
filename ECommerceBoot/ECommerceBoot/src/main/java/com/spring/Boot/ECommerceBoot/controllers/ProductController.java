package com.spring.Boot.ECommerceBoot.controllers;



import com.spring.Boot.ECommerceBoot.entities.Products;
import com.spring.Boot.ECommerceBoot.service.ProductsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
@CrossOrigin("http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductsService productsService = null;
    
   
    @GetMapping(value = "/productData")
    public List<Products> getProductData() {
        List<Products> listAllProducts = productsService.listAllProducts();
        return listAllProducts;
    }
 @GetMapping(value = "/productDataByCategory/{id}")
    public List<Products> getProductByCategoryIdData(@PathVariable("id")int Id) {
          
        List<Products> findProductById = productsService.findProductByCategoryCategoryId(Id);
        return findProductById;
    }
    
  
    
    
    @GetMapping(value = "/productDataById/{id}")
    public Products getProductByIdData(@PathVariable("id")int Id) {
          
        Products findProductById = productsService.findProductById(Id);
        return findProductById;
    }
     @GetMapping(value = "/productSearch/{name}")
    public  List<Products>getProductByCategoryData(@PathVariable("name")String name) {
        List<Products> listProductsByCategory = productsService.listProductsByContain(name);
         System.out.println(name);
        return listProductsByCategory;
    }
    
    
    
      
  
    
    
    
  
}
