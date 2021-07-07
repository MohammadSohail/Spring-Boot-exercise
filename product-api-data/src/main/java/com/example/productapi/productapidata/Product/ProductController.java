package com.example.productapi.productapidata.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/type/{id}")
    public List<Product> getProductByType(@PathVariable String id){
        return productService.getProductByType(id);
    }

    @GetMapping("/products/status/{id}")
    public List<Product> getProductByAvailability(@PathVariable String id){
        return productService.getProductByAvailability(id);
    }

    @PostMapping("/products")
    public void createProduct(@RequestBody Product product){
         productService.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable String id){
        productService.updateProduct(product, id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
