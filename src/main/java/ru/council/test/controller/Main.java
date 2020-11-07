package ru.council.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ru.council.test.model.DcCatalog;

public class Main {
    static final String URL_TANUKI = "http://frontend.tanuki.ru/feeds/raiden-delivery-club/";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<DcCatalog> result = restTemplate.getForEntity(URL_TANUKI, DcCatalog.class);

        System.out.println(result);
    }
}
