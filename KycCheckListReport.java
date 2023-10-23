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
public class KycCheckListReport implements Serializable {

    private String folioNumber;
    private String title;
    private Integer clientCode;
    private String accountType;
    private String identityProof;
    private String businessProof;
    private String sourceOfIncome;
    private String coporateInvestorDocument;

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

    public Integer getClientCode() {
        return clientCode;
    }

    public void setClientCode(Integer clientCode) {
        this.clientCode = clientCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getIdentityProof() {
        return identityProof;
    }

    public void setIdentityProof(String identityProof) {
        this.identityProof = identityProof;
    }

    public String getBusinessProof() {
        return businessProof;
    }

    public void setBusinessProof(String businessProof) {
        this.businessProof = businessProof;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public String getCoporateInvestorDocument() {
        return coporateInvestorDocument;
    }

    public void setCoporateInvestorDocument(String coporateInvestorDocument) {
        this.coporateInvestorDocument = coporateInvestorDocument;
    }

}
