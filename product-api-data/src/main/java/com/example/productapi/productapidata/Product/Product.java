package com.example.productapi.productapidata.Product;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Product {

    private String organizationCode;
    @Id
    private String productId;
    private String productType;
    private String interest;
    private String tenure;
    private String term;
    private String amount;
    private String activeFrom;
    private String deActiveFrom;
    private String totalPayout;
    private String totalSaving;
    private String status;
    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date UpdatedAt;

    public Product() { }

    public Product(String organizationCode, String productId, String productType, String amount, String status) {
        this.organizationCode = organizationCode;
        this.productId = productId;
        this.productType = productType;
        this.amount = amount;
        this.status = status;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(String activeFrom) {
        this.activeFrom = activeFrom;
    }

    public String getDeActiveFrom() {
        return deActiveFrom;
    }

    public void setDeActiveFrom(String deActiveFrom) {
        this.deActiveFrom = deActiveFrom;
    }

    public String getTotalPayout() {
        return totalPayout;
    }

    public void setTotalPayout(String totalPayout) {
        this.totalPayout = totalPayout;
    }

    public String getTotalSaving() {
        return totalSaving;
    }

    public void setTotalSaving(String totalSaving) {
        this.totalSaving = totalSaving;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        UpdatedAt = updatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
