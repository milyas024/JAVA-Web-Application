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
public class DiscrepancyDocEmail {

    private Integer id;
    private String folioNumber;
    private String emailHead;
    private String emailTo;
    private String name;
    private String address;
    private int sourceOfIncome;
    private int proofOfIncome;
    private int businessProof;
    private int visitReport;
    private int proofOfFund;
    private int whereApplicable;
    private int zakat;
    private int bankAccStatment;
    private int other;
    private String rem;

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }

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

    public String getEmailHead() {
        return emailHead;
    }

    public void setEmailHead(String emailHead) {
        this.emailHead = emailHead;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
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
    
    

    public int getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(int sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public int getProofOfIncome() {
        return proofOfIncome;
    }

    public void setProofOfIncome(int proofOfIncome) {
        this.proofOfIncome = proofOfIncome;
    }

    public int getBusinessProof() {
        return businessProof;
    }

    public void setBusinessProof(int businessProof) {
        this.businessProof = businessProof;
    }

    public int getVisitReport() {
        return visitReport;
    }

    public void setVisitReport(int visitReport) {
        this.visitReport = visitReport;
    }

    public int getProofOfFund() {
        return proofOfFund;
    }

    public void setProofOfFund(int proofOfFund) {
        this.proofOfFund = proofOfFund;
    }

    public int getWhereApplicable() {
        return whereApplicable;
    }

    public void setWhereApplicable(int whereApplicable) {
        this.whereApplicable = whereApplicable;
    }

    public int getZakat() {
        return zakat;
    }

    public void setZakat(int zakat) {
        this.zakat = zakat;
    }

    public int getBankAccStatment() {
        return bankAccStatment;
    }

    public void setBankAccStatment(int bankAccStatment) {
        this.bankAccStatment = bankAccStatment;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

}
