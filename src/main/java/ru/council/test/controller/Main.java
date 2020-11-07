package ru.council.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ru.council.test.model.Product;

public class Main {
    static final String URL_TANUKI = "http://frontend.tanuki.ru/feeds/raiden-delivery-club/";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Product> result = restTemplate.getForEntity(URL_TANUKI, Product.class);

        System.out.println(result);
    }
}
