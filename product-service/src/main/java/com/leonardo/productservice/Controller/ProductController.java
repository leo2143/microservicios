package com.leonardo.productservice.Controller;

import com.leonardo.productservice.entity.ProductEntity;
import com.leonardo.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public  List<ProductEntity>getAllProducts(){

        return repository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity product){

        repository.save(product);
    }


}
