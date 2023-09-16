package com.example.assessmentSpring.business.product;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Resource
    private ProductService productService;

    @PostMapping("/create/product")
    @Operation(summary = "Creates new product")
    public void createNewProduct(@RequestBody ProductDto product){
        productService.createNewProduct(product);
    }

}
