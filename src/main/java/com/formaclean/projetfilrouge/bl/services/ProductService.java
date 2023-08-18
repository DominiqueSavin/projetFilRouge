package com.formaclean.projetfilrouge.bl.services;

import com.formaclean.projetfilrouge.dal.entities.Product;
import com.formaclean.projetfilrouge.dal.entities.Trolley;
import com.formaclean.projetfilrouge.dal.repositories.ProductRepository;
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

    public void allocateProduct(Product product,Trolley trolley){
        product.setTrolley(trolley);
        product.isMissingProduct();
    }



}
