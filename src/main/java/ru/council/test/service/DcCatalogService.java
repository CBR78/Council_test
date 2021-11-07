package ru.council.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.council.test.model.DcCatalog;
import ru.council.test.model.DcCatalogList;
import ru.council.test.repository.DcCatalogRepository;

@Service
public class DcCatalogService {
    private final DcCatalogRepository dcCatalogRepository;

    @Autowired
    public DcCatalogService(DcCatalogRepository dcCatalogRepository) {
        this.dcCatalogRepository = dcCatalogRepository;
    }

    public void create(DcCatalog course) {
        dcCatalogRepository.save(course);
    }

    public DcCatalogList getAll() {
        DcCatalogList dcCatalogList = new DcCatalogList();

        Iterable<DcCatalog> dd = dcCatalogRepository.findAll();
        for (DcCatalog dcCatalog : dd) {
            dcCatalogList.getDcCatalogList().add(dcCatalog);
        }
        return dcCatalogList;
    }

    public DcCatalog getById(String id) {
        return dcCatalogRepository.findById(id).get();
    }
}
