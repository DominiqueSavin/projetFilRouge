package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entity.Job;
import com.formaclean.projetfilrouge.entity.Product;
import com.formaclean.projetfilrouge.models.forms.JobCreateForm;
import com.formaclean.projetfilrouge.models.forms.ProductCreateForm;
import com.formaclean.projetfilrouge.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }


    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("/products")
    public Product createProduct(@Validated @RequestBody ProductCreateForm form){
        return productService.createProduct(form.name(),form.description(),form.trolley(),form.serialNumber(),form.purchaseDate());
    }




}
