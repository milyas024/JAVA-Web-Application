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
public class PepCheckList {

    private int PEP_ID;
    private String TYPE;
    private int SR_NO;
    private String NAME;
    private String FATHER_NAME;
    private String CNIC_NUMBER;
    private Date DATE_OF_BIRTH;
    private String ADDRESS_ONE;
    private String ADDRESS_TWO;
    private String ADDRESS_THREE;
    private String PHONE_ONE;
    private String PHONE_TWO;
    private String PHONE_THREE;
    private String PHONE_FOUR;
    private String PHONE_FIVE;
    private String EMAIL;

    public int getPEP_ID() {
        return PEP_ID;
    }

    public void setPEP_ID(int PEP_ID) {
        this.PEP_ID = PEP_ID;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public int getSR_NO() {
        return SR_NO;
    }

    public void setSR_NO(int SR_NO) {
        this.SR_NO = SR_NO;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getFATHER_NAME() {
        return FATHER_NAME;
    }

    public void setFATHER_NAME(String FATHER_NAME) {
        this.FATHER_NAME = FATHER_NAME;
    }

    public String getCNIC_NUMBER() {
        return CNIC_NUMBER;
    }

    public void setCNIC_NUMBER(String CNIC_NUMBER) {
        this.CNIC_NUMBER = CNIC_NUMBER;
    }

    public Date getDATE_OF_BIRTH() {
        return DATE_OF_BIRTH;
    }

    public void setDATE_OF_BIRTH(Date DATE_OF_BIRTH) {
        this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    }

    public String getADDRESS_ONE() {
        return ADDRESS_ONE;
    }

    public void setADDRESS_ONE(String ADDRESS_ONE) {
        this.ADDRESS_ONE = ADDRESS_ONE;
    }

    public String getADDRESS_TWO() {
        return ADDRESS_TWO;
    }

    public void setADDRESS_TWO(String ADDRESS_TWO) {
        this.ADDRESS_TWO = ADDRESS_TWO;
    }

    public String getADDRESS_THREE() {
        return ADDRESS_THREE;
    }

    public void setADDRESS_THREE(String ADDRESS_THREE) {
        this.ADDRESS_THREE = ADDRESS_THREE;
    }

    public String getPHONE_ONE() {
        return PHONE_ONE;
    }

    public void setPHONE_ONE(String PHONE_ONE) {
        this.PHONE_ONE = PHONE_ONE;
    }

    public String getPHONE_TWO() {
        return PHONE_TWO;
    }

    public void setPHONE_TWO(String PHONE_TWO) {
        this.PHONE_TWO = PHONE_TWO;
    }

    public String getPHONE_THREE() {
        return PHONE_THREE;
    }

    public void setPHONE_THREE(String PHONE_THREE) {
        this.PHONE_THREE = PHONE_THREE;
    }

    public String getPHONE_FOUR() {
        return PHONE_FOUR;
    }

    public void setPHONE_FOUR(String PHONE_FOUR) {
        this.PHONE_FOUR = PHONE_FOUR;
    }

    public String getPHONE_FIVE() {
        return PHONE_FIVE;
    }

    public void setPHONE_FIVE(String PHONE_FIVE) {
        this.PHONE_FIVE = PHONE_FIVE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

}
