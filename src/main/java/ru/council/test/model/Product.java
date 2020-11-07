package ru.council.test.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.NONE)
public class Product {

    @XmlAttribute
    @XmlID
    private String id;

    @XmlElement(name = "category_id")
    private int categoryId;

    @XmlElement
    private String name;

    @XmlElement
    private String description;

    @XmlElement
    private int price;

    @XmlElement
    private String picture;
}
