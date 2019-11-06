package com.daily.needs.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created By Ajay Shetty on 3/10/2018.
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable {
    @Id
    private String productId;

    /** 名字. */
    @NotNull
    private String productName;

    /** 单价. */
    @NotNull
    private BigDecimal productPrice;

    /** 库存. */
    @NotNull
    @Min(0)
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 0: on-sale 1: off-sale */

    @ColumnDefault("0")
    private Integer productStatus;


   /** 类目编号. */
    @ColumnDefault("0")
    private Integer categoryType;

    @CreationTimestamp
    private Date createTime;
    @UpdateTimestamp
    private Date updateTime;

    public ProductInfo() {
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
