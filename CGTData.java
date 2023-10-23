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
public class CGTData {

    private String fundName;
    private String folioNumber;
    private String clientName;
    private String clientType;
    private Date redemptionDate;
    private Date priceDate;
    private Double amount;
    private Double units;
    private Double captialGainLoss;
    private Double cgtAmount;
    private String type;

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(String folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public Date getRedemptionDate() {
        return redemptionDate;
    }

    public void setRedemptionDate(Date redemptionDate) {
        this.redemptionDate = redemptionDate;
    }

    public Date getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(Date priceDate) {
        this.priceDate = priceDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double units) {
        this.units = units;
    }

    public Double getCaptialGainLoss() {
        return captialGainLoss;
    }

    public void setCaptialGainLoss(Double captialGainLoss) {
        this.captialGainLoss = captialGainLoss;
    }

    public Double getCgtAmount() {
        return cgtAmount;
    }

    public void setCgtAmount(Double cgtAmount) {
        this.cgtAmount = cgtAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
