package com.example.productapi.productapidata.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, String> {
}
