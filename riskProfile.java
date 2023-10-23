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
public class riskProfile implements Serializable {
    
    private String folionumber;
    private String acountType;
    private String clientName;
    private String eMail;
    private String riskProduct;

    public String getFolionumber() {
        return folionumber;
    }

    public void setFolionumber(String folionumber) {
        this.folionumber = folionumber;
    }

    public String getAcountType() {
        return acountType;
    }

    public void setAcountType(String acountType) {
        this.acountType = acountType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getRiskProduct() {
        return riskProduct;
    }

    public void setRiskProduct(String riskProduct) {
        this.riskProduct = riskProduct;
    }
    
}
