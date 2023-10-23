/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author wasim.abbas
 */
public class BranchSalesEnt implements Serializable {
private String title;
private String cnic;
private String  cnicExpiryDate;
private String primary_client;
private String  address;
private String   accountDate;
private String dateOfBirth;
private String phoneMobile;
private String accountNumber;
private String folioNumber;
private String city;
private String branchName;
private String priceDate;
private String fundName;
private BigDecimal quantity;
private BigDecimal amount;
private String riskProduct;
private String registationDate;
private BigDecimal loadVal;
private BigDecimal loadPer;
private BigDecimal pstVal;
private BigDecimal salesLoad;
private String accType;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getCnicExpiryDate() {
        return cnicExpiryDate;
    }

    public void setCnicExpiryDate(String cnicExpiryDate) {
        this.cnicExpiryDate = cnicExpiryDate;
    }

    public String getPrimary_client() {
        return primary_client;
    }

    public void setPrimary_client(String primary_client) {
        this.primary_client = primary_client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(String folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(String priceDate) {
        this.priceDate = priceDate;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRiskProduct() {
        return riskProduct;
    }

    public void setRiskProduct(String riskProduct) {
        this.riskProduct = riskProduct;
    }

    public String getRegistationDate() {
        return registationDate;
    }

    public void setRegistationDate(String registationDate) {
        this.registationDate = registationDate;
    }

    public BigDecimal getLoadVal() {
        return loadVal;
    }

    public void setLoadVal(BigDecimal loadVal) {
        this.loadVal = loadVal;
    }

    public BigDecimal getLoadPer() {
        return loadPer;
    }

    public void setLoadPer(BigDecimal loadPer) {
        this.loadPer = loadPer;
    }

    public BigDecimal getPstVal() {
        return pstVal;
    }

    public void setPstVal(BigDecimal pstVal) {
        this.pstVal = pstVal;
    }

    public BigDecimal getSalesLoad() {
        return salesLoad;
    }

    public void setSalesLoad(BigDecimal salesLoad) {
        this.salesLoad = salesLoad;
    }
}
