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
public class DiscrepancyDocEmailB {
    
    private Integer id;
    private String folioNumber;
    private String name;
    private String address;
    private Date regDate;
    private boolean sourceOfIncome;
    private boolean proofOfIncome;
    private boolean businessProof;
    private boolean visitReport;
    private boolean proofOfFund;
    private boolean whereApplicable;
    private boolean zakat;
    private boolean bankAccStatment;
    private boolean other;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(String folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public boolean isSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(boolean sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public boolean isProofOfIncome() {
        return proofOfIncome;
    }

    public void setProofOfIncome(boolean proofOfIncome) {
        this.proofOfIncome = proofOfIncome;
    }

    public boolean isBusinessProof() {
        return businessProof;
    }

    public void setBusinessProof(boolean businessProof) {
        this.businessProof = businessProof;
    }

    public boolean isVisitReport() {
        return visitReport;
    }

    public void setVisitReport(boolean visitReport) {
        this.visitReport = visitReport;
    }

    public boolean isProofOfFund() {
        return proofOfFund;
    }

    public void setProofOfFund(boolean proofOfFund) {
        this.proofOfFund = proofOfFund;
    }

    public boolean isWhereApplicable() {
        return whereApplicable;
    }

    public void setWhereApplicable(boolean whereApplicable) {
        this.whereApplicable = whereApplicable;
    }

    public boolean isZakat() {
        return zakat;
    }

    public void setZakat(boolean zakat) {
        this.zakat = zakat;
    }

    public boolean isBankAccStatment() {
        return bankAccStatment;
    }

    public void setBankAccStatment(boolean bankAccStatment) {
        this.bankAccStatment = bankAccStatment;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }
    
    
    
}
