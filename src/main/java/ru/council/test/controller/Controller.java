package ru.council.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.council.test.model.Categories;
import ru.council.test.model.Category;
import ru.council.test.model.DeliveryService;
import ru.council.test.model.Product;
import ru.council.test.model.Products;

@RestController
@RequestMapping("tanuki")
public class Controller {

    @GetMapping
    public ResponseEntity<DeliveryService> getProduct() {

        Product productOne = new Product("1495", 10, "Ямато", "Лосось, креветка", 415,
                "https://static4.tanuki");
        Product productTwo = new Product("1496", 10, "Сэнсэй", "Креветка темпура, лосось", 415,
                "CnFnqPp28.jpg");
        Product productThree = new Product("1497", 10, "Гауди", "Лосось копченый, руккола", 415,
                "wu8k4UlHrQnQV.jpg");

        Category categoryOne = new Category("23", null, "Соусы");
        Category categoryTwo = new Category("24", null, "Напитки");
        Category categoryThree = new Category("6", "2", "Нигири");

        Categories categories = new Categories();
        categories.getCategories().add(categoryOne);
        categories.getCategories().add(categoryTwo);
        categories.getCategories().add(categoryThree);

        Products products = new Products();
        products.getProducts().add(productOne);
        products.getProducts().add(productTwo);
        products.getProducts().add(productThree);

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setCategories(categories);
        deliveryService.setProducts(products);

        return new ResponseEntity<DeliveryService>(deliveryService, HttpStatus.OK);
    }
}
