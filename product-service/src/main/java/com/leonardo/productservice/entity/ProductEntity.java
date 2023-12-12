package com.leonardo.productservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "product")
@NoArgsConstructor
public class ProductEntity {

    @Id
    private String id;

    private String productName;

    private String productDescription;

    private Double unitePrice;
}
