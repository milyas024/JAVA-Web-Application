/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author wasim.abbas
 */
public class StackEnt {
private int stackid;
private String fundCode;

private String schemeCode;
private Date schemeIssueDate;
private String buyContractNum;
private String selContractNum;
private BigDecimal buyQuantity;
private BigDecimal selQuantity;
private BigDecimal balance;
private String fundName;

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public int getStackid() {
        return stackid;
    }

    public void setStackid(int stackid) {
        this.stackid = stackid;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public Date getSchemeIssueDate() {
        return schemeIssueDate;
    }

    public void setSchemeIssueDate(Date schemeIssueDate) {
        this.schemeIssueDate = schemeIssueDate;
    }

    public String getBuyContractNum() {
        return buyContractNum;
    }

    public void setBuyContractNum(String buyContractNum) {
        this.buyContractNum = buyContractNum;
    }

    public String getSelContractNum() {
        return selContractNum;
    }

    public void setSelContractNum(String selContractNum) {
        this.selContractNum = selContractNum;
    }

    public BigDecimal getBuyQuantity() {
        return buyQuantity;
    }

    public void setBuyQuantity(BigDecimal buyQuantity) {
        this.buyQuantity = buyQuantity;
    }

    public BigDecimal getSelQuantity() {
        return selQuantity;
    }

    public void setSelQuantity(BigDecimal selQuantity) {
        this.selQuantity = selQuantity;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
