package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entity.Product;
import com.formaclean.projetfilrouge.entity.Supply;
import com.formaclean.projetfilrouge.entity.Trolley;
import com.formaclean.projetfilrouge.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product createProduct(String name, String description, Trolley trolley, String serialNumber, LocalDate purchaseDate){
        Product product = new Product(name,description,trolley);
        product.setSerialNumber(serialNumber);
        product.setPurchaseDate(purchaseDate);
        productRepository.save(product);
        return product;
    }

}