package com.example.assessmentSpring.business.product;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/create")
    @Operation(summary = "Creates new product")
    public void createNewProduct(@RequestBody){

    }

}
