package com.openrca.templates.ecomspringboot.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Table
@Entity
@Builder
@Data
public class Product {


    @Id

    @GeneratedValue
    private Long productId;

    @ManyToOne
    private ProductSubCategory subCategory;

    private String productName;

    private Float price;

    private Integer quantity;

    private String image_url;

    private String description;

    private Date addedAt;

}
