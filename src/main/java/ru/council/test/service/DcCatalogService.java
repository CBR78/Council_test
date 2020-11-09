package ru.council.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import ru.council.test.model.DcCatalog;
import ru.council.test.repository.DcCatalogRepository;

@Service
public class DcCatalogService {
    @Autowired
    private DcCatalogRepository dcCatalogRepository;

    public DcCatalog create(DcCatalog course) {
        return dcCatalogRepository.save(course);
    }

    public List<DcCatalog> getAll() {
        return Lists.newArrayList(dcCatalogRepository.findAll());
    }

    public DcCatalog getById(String id) {
        return dcCatalogRepository.findById(id).get();
    }
}
