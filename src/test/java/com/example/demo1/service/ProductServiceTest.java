package com.example.demo1.service;

import com.example.demo1.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void saveProductTest() {

        Product product = Product.builder()
                .name("Rice")
                .build();

        Product save = productService.save(product);

        assertThat(save).isNotNull();
        assertThat(save.getName()).isEqualTo("Rice");
    }

}
