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
    @Column
    @GeneratedValue
    private Long productId;

    @Column
    private Long subCategoryId;

    @Column
    private String productName;

    @Column
    private Float price;

    @Column
    private Integer quantity;

    @Column
    private String image_url;

    @Column
    private String description;

    @Column
    private Date addedAt;

}
