package fit.iuh.edu.week01_microservicedemo.controllers;


import fit.iuh.edu.week01_microservicedemo.entites.Product;
import fit.iuh.edu.week01_microservicedemo.entites.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    RestTemplate restTemplate = new RestTemplate();
    String fooResourceUrl
            = "http://localhost:8080/user/";

    @GetMapping("/product/{id}")

    public ResponseEntity<Product> getTutorialById(@PathVariable("id") long id) {

        ResponseEntity<User> response
                = restTemplate.getForEntity(fooResourceUrl + id, User.class);
        System.out.println("body ne:"+response.getBody());

    Product product = new Product("1","ca chua",1000.0,response.getBody());
        return new ResponseEntity<>(product, HttpStatus.OK);

    }



}
