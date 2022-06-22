package com.TimoProject.SellApp.vo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Data
@DynamicUpdate
public class ProductCategoryVO {
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

}
