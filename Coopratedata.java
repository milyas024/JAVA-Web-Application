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
 * @author wasim.abbas
 */
public class Coopratedata implements Serializable {

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

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNicPassport() {
        return nicPassport;
    }

    public void setNicPassport(String nicPassport) {
        this.nicPassport = nicPassport;
    }
    private String clientName;
    private String folioNumber;
    private String registrationNo;
    private String name;
    private String designation;
    private String status;
    private String nicPassport;
    private String title;
    private String categoryOfSignatory;
    private Date cnicIssueDate;
    private Date cnicExpiryDate;
    private Date dateOfBirth;
    private String countryOfBirth;
    private String nationality;
    private String phoneNo;
    private String email;
    private String pep;
    private String sigRemarks;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryOfSignatory() {
        return categoryOfSignatory;
    }

    public void setCategoryOfSignatory(String categoryOfSignatory) {
        this.categoryOfSignatory = categoryOfSignatory;
    }

    public Date getCnicIssueDate() {
        return cnicIssueDate;
    }

    public void setCnicIssueDate(Date cnicIssueDate) {
        this.cnicIssueDate = cnicIssueDate;
    }

    public Date getCnicExpiryDate() {
        return cnicExpiryDate;
    }

    public void setCnicExpiryDate(Date cnicExpiryDate) {
        this.cnicExpiryDate = cnicExpiryDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPep() {
        return pep;
    }

    public void setPep(String pep) {
        this.pep = pep;
    }

    public String getSigRemarks() {
        return sigRemarks;
    }

    public void setSigRemarks(String sigRemarks) {
        this.sigRemarks = sigRemarks;
    }
    
    
    
    
    
}
