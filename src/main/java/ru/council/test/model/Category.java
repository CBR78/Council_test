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
@XmlRootElement(name = "category")
@XmlAccessorType(XmlAccessType.NONE)
public class Category {

    @XmlAttribute
    @XmlID
    private String id;

    @XmlAttribute
    private String parentId;

    @XmlElement
    private String category;
}
