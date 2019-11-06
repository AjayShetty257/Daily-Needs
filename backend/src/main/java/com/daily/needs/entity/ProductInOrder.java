package com.daily.needs.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created By Ajay Shetty on 3/14/2018.
 */
@Entity
@Data
@NoArgsConstructor
public class ProductInOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "cart_id")
    @JsonIgnore
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private OrderMain orderMain;


    @NotEmpty
    private String productId;

    /**
     * 名字.
     */
    @NotEmpty
    private String productName;

    /**
     * 描述.
     */
    @NotNull
    private String productDescription;

    /**
     * 小图.
     */
    private String productIcon;

    /**
     * 类目编号.
     */
    @NotNull
    private Integer categoryType;

    /**
     * 单价.
     */
    @NotNull
    private BigDecimal productPrice;

    /**
     * 库存.
     */
    @Min(0)
    private Integer productStock;

    @Min(1)
    private Integer count;


    public ProductInOrder(ProductInfo productInfo, Integer quantity) {
        this.productId = productInfo.getProductId();
        this.productName = productInfo.getProductName();
        this.productDescription = productInfo.getProductDescription();
        this.productIcon = productInfo.getProductIcon();
        this.categoryType = productInfo.getCategoryType();
        this.productPrice = productInfo.getProductPrice();
        this.productStock = productInfo.getProductStock();
        this.count = quantity;
    }

    @Override
    public String toString() {
        return "ProductInOrder{" +
                "id=" + id +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productIcon='" + productIcon + '\'' +
                ", categoryType=" + categoryType +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductInOrder that = (ProductInOrder) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productDescription, that.productDescription) &&
                Objects.equals(productIcon, that.productIcon) &&
                Objects.equals(categoryType, that.categoryType) &&
                Objects.equals(productPrice, that.productPrice);
    }

    public String getProductId() {
        return productId;
    }

    public Long getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }

    public OrderMain getOrderMain() {
        return orderMain;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public Integer getCount() {
        return count;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setOrderMain(OrderMain orderMain) {
        this.orderMain = orderMain;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, productId, productName, productDescription, productIcon, categoryType, productPrice);
    }
}
