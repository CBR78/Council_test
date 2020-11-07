package ru.council.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.council.test.model.Category;
import ru.council.test.model.DcCatalog;
import ru.council.test.model.DeliveryService;
import ru.council.test.model.Product;

@RestController
@RequestMapping("tanuki")
public class Controller {

    Product productOne = new Product("1495", 10, "Ямато", "Лосось, креветка", 415,
            "https://static4.tanuki");
    Product productTwo = new Product("1496", 10, "Сэнсэй", "Креветка темпура, лосось", 415,
            "CnFnqPp28.jpg");
    Product productThree = new Product("1497", 10, "Гауди", "Лосось копченый, руккола", 415,
            "wu8k4UlHrQnQV.jpg");

    Category categoryOne = new Category("23", null, "Соусы");
    Category categoryTwo = new Category("24", null, "Напитки");
    Category categoryThree = new Category("6", "2", "Нигири");

    @GetMapping
    public ResponseEntity<DeliveryService> getProduct() {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.getCategory().add(categoryOne);
        deliveryService.getCategory().add(categoryTwo);
        deliveryService.getCategory().add(categoryThree);

        deliveryService.getProduct().add(productOne);
        deliveryService.getProduct().add(productTwo);
        deliveryService.getProduct().add(productThree);

        return new ResponseEntity<DeliveryService>(deliveryService, HttpStatus.OK);
    }

    @GetMapping("/dc_catalog")
    public ResponseEntity<DcCatalog> getDcCatalog() {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.getCategory().add(categoryOne);
        deliveryService.getCategory().add(categoryTwo);
        deliveryService.getCategory().add(categoryThree);

        deliveryService.getProduct().add(productOne);
        deliveryService.getProduct().add(productTwo);
        deliveryService.getProduct().add(productThree);

        DcCatalog dcCatalog = new DcCatalog();
        dcCatalog.setLastUpdate("2020-11-08 02:01:23");
        dcCatalog.setDeliveryService(deliveryService);

        return new ResponseEntity<DcCatalog>(dcCatalog, HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<Category> getCategory() {
        return new ResponseEntity<Category>(categoryThree, HttpStatus.OK);
    }
}
