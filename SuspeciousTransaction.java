/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;

/**
 *
 * @author Zunair.Sarwar
 */
public class SuspeciousTransaction implements Serializable {

    private String folioNumber;
    private String accountOpeningDate;
    private String initialInvestment;
    private String investmentCount;
    private String totalCurrentInvestment;
    private String redemptionCount;
    private String totalRedemptionAmount;

    public String getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(String folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getInitialInvestment() {
        return initialInvestment;
    }

    public void setInitialInvestment(String initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    public String getInvestmentCount() {
        return investmentCount;
    }

    public void setInvestmentCount(String investmentCount) {
        this.investmentCount = investmentCount;
    }

    public String getTotalCurrentInvestment() {
        return totalCurrentInvestment;
    }

    public void setTotalCurrentInvestment(String totalCurrentInvestment) {
        this.totalCurrentInvestment = totalCurrentInvestment;
    }

    public String getRedemptionCount() {
        return redemptionCount;
    }

    public void setRedemptionCount(String redemptionCount) {
        this.redemptionCount = redemptionCount;
    }

    public String getTotalRedemptionAmount() {
        return totalRedemptionAmount;
    }

    public void setTotalRedemptionAmount(String totalRedemptionAmount) {
        this.totalRedemptionAmount = totalRedemptionAmount;
    }

}
