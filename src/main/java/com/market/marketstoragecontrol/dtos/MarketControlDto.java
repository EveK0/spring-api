package com.market.marketstoragecontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MarketControlDto {
    @NotBlank
    private String productName;
    @NotBlank
    @Size(max = 55)
    private Float productValue;
    @NotBlank
    private Integer productQuantity;
    @NotBlank
    @Size(max = 55)
    private String supplierCompany;
    @NotBlank
    private Integer soldAmount;
    @NotBlank
    @Size(max = 75)
    private String purchaseLot;

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

    public String getPurchaseLot() {
        return purchaseLot;
    }

    public void setPurchaseLot(String purchaseLot) {
        this.purchaseLot = purchaseLot;
    }
}
