/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.util.Date;

/**
 *
 * @author Zunair.Sarwar
 */
public class EoiOperationReport {

    private Double transId;
    private String financialId;
    private String fundCode;
    private String folioNo;
    private Date transDate;
    private Double transUnit;
    private Double purchasePrice;
    private Double purchaseAmount;
    private Double eoiPurchasePrice;
    private Double eoiPayoutPrice;
    private Double taxableDividendPrice;
    private Double totalDividend;
    private Double eoiRefund;
    private Double taxableDividendAmount;
    private Double grossPayable;
    private Double taxRate;
    private Double taxAmount;
    private Double netPayment;
    private Double newCgtCost;
    private Double paidTotal;
    private Double decId;

    public Double getTransId() {
        return transId;
    }

    public void setTransId(Double transId) {
        this.transId = transId;
    }

    public String getFinancialId() {
        return financialId;
    }

    public void setFinancialId(String financialId) {
        this.financialId = financialId;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFolioNo() {
        return folioNo;
    }

    public void setFolioNo(String folioNo) {
        this.folioNo = folioNo;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Double getTransUnit() {
        return transUnit;
    }

    public void setTransUnit(Double transUnit) {
        this.transUnit = transUnit;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Double getEoiPurchasePrice() {
        return eoiPurchasePrice;
    }

    public void setEoiPurchasePrice(Double eoiPurchasePrice) {
        this.eoiPurchasePrice = eoiPurchasePrice;
    }

    public Double getEoiPayoutPrice() {
        return eoiPayoutPrice;
    }

    public void setEoiPayoutPrice(Double eoiPayoutPrice) {
        this.eoiPayoutPrice = eoiPayoutPrice;
    }

    public Double getTaxableDividendPrice() {
        return taxableDividendPrice;
    }

    public void setTaxableDividendPrice(Double taxableDividendPrice) {
        this.taxableDividendPrice = taxableDividendPrice;
    }

    public Double getTotalDividend() {
        return totalDividend;
    }

    public void setTotalDividend(Double totalDividend) {
        this.totalDividend = totalDividend;
    }

    public Double getEoiRefund() {
        return eoiRefund;
    }

    public void setEoiRefund(Double eoiRefund) {
        this.eoiRefund = eoiRefund;
    }

    public Double getTaxableDividendAmount() {
        return taxableDividendAmount;
    }

    public void setTaxableDividendAmount(Double taxableDividendAmount) {
        this.taxableDividendAmount = taxableDividendAmount;
    }

    public Double getGrossPayable() {
        return grossPayable;
    }

    public void setGrossPayable(Double grossPayable) {
        this.grossPayable = grossPayable;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getNetPayment() {
        return netPayment;
    }

    public void setNetPayment(Double netPayment) {
        this.netPayment = netPayment;
    }

    public Double getNewCgtCost() {
        return newCgtCost;
    }

    public void setNewCgtCost(Double newCgtCost) {
        this.newCgtCost = newCgtCost;
    }

    public Double getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(Double paidTotal) {
        this.paidTotal = paidTotal;
    }

    public Double getDecId() {
        return decId;
    }

    public void setDecId(Double decId) {
        this.decId = decId;
    }

}
