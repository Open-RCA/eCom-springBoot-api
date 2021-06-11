package com.openrca.templates.ecomspringboot.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Table
@Entity
@Builder
@Data
public class ProductSubCategory {

    @Id
    @Column
    private Long subCategoryId;

    @Column
    private String subCategoryName;

    @Column
    private Integer categoryId;

    @Column
    private Date addedAt;

}
