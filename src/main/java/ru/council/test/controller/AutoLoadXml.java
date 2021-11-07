package ru.council.test.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ru.council.test.model.DcCatalog;
import ru.council.test.service.DcCatalogService;

@Component
public class AutoLoadXml {
    private static final String URL = "http://frontend.tanuki.ru/feeds/raiden-delivery-club/";
    private final DcCatalogService dcCatalogService;

    @Autowired
    public AutoLoadXml(DcCatalogService dcCatalogService) {
        this.dcCatalogService = dcCatalogService;
    }

    @PostConstruct
    public void loadXml() {
        RestTemplate restTemplate = new RestTemplate();
        DcCatalog dcCatalog = restTemplate.getForObject(URL, DcCatalog.class);
        dcCatalogService.create(dcCatalog);
    }
}
