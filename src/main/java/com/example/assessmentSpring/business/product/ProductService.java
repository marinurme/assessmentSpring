package com.example.assessmentSpring.business.product;

import com.example.assessmentSpring.domain.product.Product;
import com.example.assessmentSpring.domain.product.ProductRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Resource
    private ProductRepository productRepository;
    public void createNewProduct(ProductDto product) {
        Product newProduct = new Product(product.getName(), product.getSkuCode(), product.getUnitPrice());
            productRepository.save(newProduct);
    }
}
