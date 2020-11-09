package ru.council.test.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import ru.council.test.model.DcCatalog;

public interface DcCatalogRepository extends ElasticsearchRepository <DcCatalog, String>{

}
