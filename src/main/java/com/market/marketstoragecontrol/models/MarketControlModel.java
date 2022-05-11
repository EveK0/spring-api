package com.market.marketstoragecontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MARKET_CONTROL")
public class MarketControlModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = false, length = 55)
    private String productName; // nome do produto
    @Column(nullable = false, unique = false, length = 30)
    private Float productValue; // preço do produto
    @Column(nullable = false, unique = false)
    private Integer productQuantity; // quantidade do produto
    @Column(nullable = false, unique = true, length = 30)
    private String supplierCompany; // empresa fornecedora
    @Column(nullable = false, unique = false)
    private Integer soldAmount; // quantidade vendida
    @Column(nullable = false)
    private LocalDateTime localDateTime; // data de registro
    @Column(nullable = false, unique = true, length = 30)
    private String purchaseLot; // lote da compra

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductValue() {
        return productValue;
    }

    public void setProductValue(Float productValue) {
        this.productValue = productValue;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setproductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getSupplierCompany() {
        return supplierCompany;
    }

    public void setSupplierCompany(String supplierCompany) {
        this.supplierCompany = supplierCompany;
    }

    public Integer getsoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(Integer soldAmount) {
        this.soldAmount = soldAmount;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setRegisterDate(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getPurchaseLot() {
        return purchaseLot;
    }

    public void setPurchaseLot(String purchaseLot) {
        this.purchaseLot = purchaseLot;
    }

    public MarketControlModel save(MarketControlModel marketControlModel) {
        return null;
    }

}
