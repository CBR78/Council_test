package ru.council.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.council.test.model.DcCatalogList;
import ru.council.test.service.DcCatalogService;

@RestController
@RequestMapping("tanuki")
public class Controller {

    @Autowired
    DcCatalogService dcCatalogService;

    @GetMapping
    public ResponseEntity<DcCatalogList> getAll() {
        return new ResponseEntity<DcCatalogList>(dcCatalogService.getAll(), HttpStatus.OK);
    }
}
