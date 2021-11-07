package ru.council.test.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@XmlRootElement(name = "dc_catalog")
@XmlAccessorType(XmlAccessType.FIELD)
@Document(indexName = "dc_catalog")
public class DcCatalog {

    @XmlAttribute(name = "last_update")
    @Id
    @Field(name = "last_update")
    private String lastUpdate;

    @XmlElement(name = "delivery_service")
    @Field(name = "delivery_service")
    private DeliveryService deliveryService;
}
