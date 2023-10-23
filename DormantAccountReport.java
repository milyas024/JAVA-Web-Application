/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zunair.Sarwar
 */
public class DormantAccountReport implements Serializable {

    private String folioNumber;
    private String title;
    private String accountType;
    private String lastActivityDate;
    private Integer noOfDays;
    private Integer balanceUnits;

    public String getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(String folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Integer getBalanceUnits() {
        return balanceUnits;
    }

    public void setBalanceUnits(Integer balanceUnits) {
        this.balanceUnits = balanceUnits;
    }

}
