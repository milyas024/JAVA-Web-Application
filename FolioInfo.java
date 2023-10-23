/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;

/**
 *
 * @author wasim.abbas
 */
public class FolioInfo implements Serializable {
    
    private String title;
    private String address1;
    private String phoneMobile;
    private String landLine;
    private String dateOfBirth;
    private String openingDate;
    private String zakatCertificate;
    private String accountType;
    private String riskProduct;
    private String holdMail;
    private String planName;
    private String accountNumber;
    private String dividendOrBonus;
    private String accStatus;
    private String CnicExpiryDate;
    private String Nominee;
    private String RedInstr;

    private String nicPassport;

    public String getNicPassport() {
        return nicPassport;
    }

    public void setNicPassport(String nicPassport) {
        this.nicPassport = nicPassport;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getZakatCertificate() {
        return zakatCertificate;
    }

    public void setZakatCertificate(String zakatCertificate) {
        this.zakatCertificate = zakatCertificate;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getRiskProduct() {
        return riskProduct;
    }

    public void setRiskProduct(String riskProduct) {
        this.riskProduct = riskProduct;
    }

    public String getHoldMail() {
        return holdMail;
    }

    public void setHoldMail(String holdMail) {
        this.holdMail = holdMail;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDividendOrBonus() {
        return dividendOrBonus;
    }

    public void setDividendOrBonus(String dividendOrBonus) {
        this.dividendOrBonus = dividendOrBonus;
    }

    public String getRedInstr() {
        return RedInstr;
    }

    public void setRedInstr(String RedInstr) {
        this.RedInstr = RedInstr;
    }
    private String JointAcc;

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public String getCnicExpiryDate() {
        return CnicExpiryDate;
    }

    public void setCnicExpiryDate(String CnicExpiryDate) {
        this.CnicExpiryDate = CnicExpiryDate;
    }

    public String getNominee() {
        return Nominee;
    }

    public void setNominee(String Nominee) {
        this.Nominee = Nominee;
    }

    public String getJointAcc() {
        return JointAcc;
    }

    public void setJointAcc(String JointAcc) {
        this.JointAcc = JointAcc;
    }

}
