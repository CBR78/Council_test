package ru.council.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "dc_catalog_list")
@XmlAccessorType(XmlAccessType.FIELD)
public class DcCatalogList {

    private List<DcCatalog> dcCatalogList = new ArrayList<>();
}
