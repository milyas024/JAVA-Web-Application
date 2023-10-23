/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author wasim.abbas
 */
public class IndividualData implements Serializable {
    private String clientName;
    private String folioNumber;
    private String passport;
    private String designation;
    private String address1;
    private String dateOfBirth;
     
    private String minorMajor;
    private String status;
    private String fatherHusbName;
    private Date dOB;

    
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public Date getdOB() {
        return dOB;
    }

    public void setdOB(Date dOB) {
        this.dOB= dOB;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(String folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMinorMajor() {
        return minorMajor;
    }

    public void setMinorMajor(String minorMajor) {
        this.minorMajor = minorMajor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFatherHusbName() {
        return fatherHusbName;
    }

    public void setFatherHusbName(String fatherHusbName) {
        this.fatherHusbName = fatherHusbName;
    }

    public String getNicPassport() {
        return nicPassport;
    }

    public void setNicPassport(String nicPassport) {
        this.nicPassport = nicPassport;
    }
    private String nicPassport;
    
}
