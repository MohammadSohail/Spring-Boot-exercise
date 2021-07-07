package com.example.productapi.productapidata.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /*
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("chaldal", "mango", "Fruits", "100"),
            new Product("chaldal", "banana", "Fruits", "60"),
            new Product("shezan", "mango-juice", "Beverage", "20"),
            new Product("transcom", "pepsi", "Beverage", "30"),
            new Product("transcom", "sprite", "Beverage", "15"),
            new Product("fresh", "water", "water", "20")
    ));
     */

    public List<Product> getAllProducts(){
        List<Product>products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public List<Product> getProductByType(String type){
        //return products.stream().filter(t -> t.getProductId().equals(id)).findFirst().get();
        //return productRepository.findById(id).get();
        List<Product>filteredProducts = new ArrayList<>();
        List<Product>products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProductType().equals(type)){
                filteredProducts.add(products.get(i));
            }
        }
        return filteredProducts;
    }

    public List<Product> getProductByAvailability(String status){
        List<Product>res = new ArrayList<>();
        List<Product>products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getStatus().equals(status)){
                res.add(products.get(i));
            }
        }
        return res;
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(Product product, String id){
//        for(int i = 0; i < products.size(); i++){
//            if(products.get(i).getProductId().equals(id)){
//                products.set(i, product);
//                return;
//            }
//        }
        productRepository.save(product);

    }

    public void deleteProduct(String id){
        //products.removeIf(t -> t.getProductId().equals(id));
        productRepository.deleteById(id);
    }
}
