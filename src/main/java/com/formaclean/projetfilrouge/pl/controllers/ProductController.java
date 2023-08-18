package com.formaclean.projetfilrouge.pl.controllers;

import com.formaclean.projetfilrouge.dal.entities.Product;
import com.formaclean.projetfilrouge.dal.entities.Trolley;
import com.formaclean.projetfilrouge.models.forms.ProductCreateForm;
import com.formaclean.projetfilrouge.bl.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/produits/allocate")
    public void allocateProduct(Product product, Trolley trolley){
        productService.allocateProduct(product,trolley);
    }




}
