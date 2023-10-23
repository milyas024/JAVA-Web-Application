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
public class FolioDataReport implements Serializable{
    
    private String CONTRACT_NUM;
    private Date TRANS_DATE;
    private Date VALUE_DATE;
    private Date END_DATE;
    private String TRANS_TYPE;
    private String FUND_NAME;
    private String SCHEME;
    private String BROKER_CODE;
    private Double BROKERAGE_RATE;
    private String BROKERAGE;
    private String BUY_OR_SELL;
    private String COUNTERPARTY;
    private Double YIELD;
    private Double MATURITY_AMOUNT;
    private Double TRANSACTION_AMOUNT;
    private Double MATURITY_VOUCHER;
    private String PAYMENT_MODE;

    public String getCONTRACT_NUM() {
        return CONTRACT_NUM;
    }

    public void setCONTRACT_NUM(String CONTRACT_NUM) {
        this.CONTRACT_NUM = CONTRACT_NUM;
    }

    public Date getTRANS_DATE() {
        return TRANS_DATE;
    }

    public void setTRANS_DATE(Date TRANS_DATE) {
        this.TRANS_DATE = TRANS_DATE;
    }

    public Date getVALUE_DATE() {
        return VALUE_DATE;
    }

    public void setVALUE_DATE(Date VALUE_DATE) {
        this.VALUE_DATE = VALUE_DATE;
    }

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public String getTRANS_TYPE() {
        return TRANS_TYPE;
    }

    public void setTRANS_TYPE(String TRANS_TYPE) {
        this.TRANS_TYPE = TRANS_TYPE;
    }

    public String getFUND_NAME() {
        return FUND_NAME;
    }

    public void setFUND_NAME(String FUND_NAME) {
        this.FUND_NAME = FUND_NAME;
    }

    public String getSCHEME() {
        return SCHEME;
    }

    public void setSCHEME(String SCHEME) {
        this.SCHEME = SCHEME;
    }

    public String getBROKER_CODE() {
        return BROKER_CODE;
    }

    public void setBROKER_CODE(String BROKER_CODE) {
        this.BROKER_CODE = BROKER_CODE;
    }

    public Double getBROKERAGE_RATE() {
        return BROKERAGE_RATE;
    }

    public void setBROKERAGE_RATE(Double BROKERAGE_RATE) {
        this.BROKERAGE_RATE = BROKERAGE_RATE;
    }

    public String getBROKERAGE() {
        return BROKERAGE;
    }

    public void setBROKERAGE(String BROKERAGE) {
        this.BROKERAGE = BROKERAGE;
    }

    public String getBUY_OR_SELL() {
        return BUY_OR_SELL;
    }

    public void setBUY_OR_SELL(String BUY_OR_SELL) {
        this.BUY_OR_SELL = BUY_OR_SELL;
    }

    public String getCOUNTERPARTY() {
        return COUNTERPARTY;
    }

    public void setCOUNTERPARTY(String COUNTERPARTY) {
        this.COUNTERPARTY = COUNTERPARTY;
    }

    public Double getYIELD() {
        return YIELD;
    }

    public void setYIELD(Double YIELD) {
        this.YIELD = YIELD;
    }

    public Double getMATURITY_AMOUNT() {
        return MATURITY_AMOUNT;
    }

    public void setMATURITY_AMOUNT(Double MATURITY_AMOUNT) {
        this.MATURITY_AMOUNT = MATURITY_AMOUNT;
    }

    public Double getTRANSACTION_AMOUNT() {
        return TRANSACTION_AMOUNT;
    }

    public void setTRANSACTION_AMOUNT(Double TRANSACTION_AMOUNT) {
        this.TRANSACTION_AMOUNT = TRANSACTION_AMOUNT;
    }

    public Double getMATURITY_VOUCHER() {
        return MATURITY_VOUCHER;
    }

    public void setMATURITY_VOUCHER(Double MATURITY_VOUCHER) {
        this.MATURITY_VOUCHER = MATURITY_VOUCHER;
    }

    public String getPAYMENT_MODE() {
        return PAYMENT_MODE;
    }

    public void setPAYMENT_MODE(String PAYMENT_MODE) {
        this.PAYMENT_MODE = PAYMENT_MODE;
    }
    
    
    
}
