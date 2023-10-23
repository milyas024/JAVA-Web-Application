/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author wasim.abbas
 */
public class PortoFolioEnt implements Serializable {

    private String schemeType;
    private String schemeIssueDesc;
    private String broker;
    private String counterParty;
    private Date transDate;
    private Date setDate;
    private String transType;
    private Double brokerageRate;
    private Double brokerage;
    private String buySell;
    private String postedVoucher;
    private String fisSecurityType;
    private Double custodyorsgl;
    private Double faceValue;
    private Double price;
    private Double premiumDiscount;
    private Double yield;
    private Double yieldMaturity;
    private Double quantity;
    private Double transactedAmount;
    private Double accrudeAmount;
    private Date lastCouponDate;
    private Date nextCouponDate;
    private Double nOfDays;
    private Date schemeMaturityDate;
    private Double couponRate;
    private String fundName;

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getSchemeType() {
        return schemeType;
    }

    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }

    public String getSchemeIssueDesc() {
        return schemeIssueDesc;
    }

    public void setSchemeIssueDesc(String schemeIssueDesc) {
        this.schemeIssueDesc = schemeIssueDesc;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public Double getBrokerageRate() {
        return brokerageRate;
    }

    public void setBrokerageRate(Double brokerageRate) {
        this.brokerageRate = brokerageRate;
    }

    public Double getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(Double brokerage) {
        this.brokerage = brokerage;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public String getPostedVoucher() {
        return postedVoucher;
    }

    public void setPostedVoucher(String postedVoucher) {
        this.postedVoucher = postedVoucher;
    }

    public String getFisSecurityType() {
        return fisSecurityType;
    }

    public void setFisSecurityType(String fisSecurityType) {
        this.fisSecurityType = fisSecurityType;
    }

    public Double getCustodyorsgl() {
        return custodyorsgl;
    }

    public void setCustodyorsgl(Double custodyorsgl) {
        this.custodyorsgl = custodyorsgl;
    }

    public Double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPremiumDiscount() {
        return premiumDiscount;
    }

    public void setPremiumDiscount(Double premiumDiscount) {
        this.premiumDiscount = premiumDiscount;
    }

    public Double getYield() {
        return yield;
    }

    public void setYield(Double yield) {
        this.yield = yield;
    }

    public Double getYieldMaturity() {
        return yieldMaturity;
    }

    public void setYieldMaturity(Double yieldMaturity) {
        this.yieldMaturity = yieldMaturity;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTransactedAmount() {
        return transactedAmount;
    }

    public void setTransactedAmount(Double transactedAmount) {
        this.transactedAmount = transactedAmount;
    }

    public Double getAccrudeAmount() {
        return accrudeAmount;
    }

    public void setAccrudeAmount(Double accrudeAmount) {
        this.accrudeAmount = accrudeAmount;
    }

    public Date getLastCouponDate() {
        return lastCouponDate;
    }

    public void setLastCouponDate(Date lastCouponDate) {
        this.lastCouponDate = lastCouponDate;
    }

    public Date getNextCouponDate() {
        return nextCouponDate;
    }

    public void setNextCouponDate(Date nextCouponDate) {
        this.nextCouponDate = nextCouponDate;
    }

    public Double getnOfDays() {
        return nOfDays;
    }

    public void setnOfDays(Double nOfDays) {
        this.nOfDays = nOfDays;
    }

    public Date getSchemeMaturityDate() {
        return schemeMaturityDate;
    }

    public void setSchemeMaturityDate(Date schemeMaturityDate) {
        this.schemeMaturityDate = schemeMaturityDate;
    }

    public Double getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(Double couponRate) {
        this.couponRate = couponRate;
    }
}
