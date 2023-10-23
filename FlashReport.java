/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.math.BigDecimal;

/**
 *
 * @author Zunair.Sarwar
 */
public class FlashReport {

    private String DESCRIPTION;
    private int GLCODE;
    private String GLHEAD;
    private int SEQUENCE;
    private BigDecimal ABL_FPDBT;
    private BigDecimal ABL_PFEQT;
    private BigDecimal ABL_PFMM;
    private BigDecimal ABL_IFPFDBT;
    private BigDecimal ABL_IFPFEQ;
    private BigDecimal ABL_IFPFMM;

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public int getGLCODE() {
        return GLCODE;
    }

    public void setGLCODE(int GLCODE) {
        this.GLCODE = GLCODE;
    }

    public String getGLHEAD() {
        return GLHEAD;
    }

    public void setGLHEAD(String GLHEAD) {
        this.GLHEAD = GLHEAD;
    }

    public int getSEQUENCE() {
        return SEQUENCE;
    }

    public void setSEQUENCE(int SEQUENCE) {
        this.SEQUENCE = SEQUENCE;
    }

    public BigDecimal getABL_FPDBT() {
        return ABL_FPDBT;
    }

    public void setABL_FPDBT(BigDecimal ABL_FPDBT) {
        this.ABL_FPDBT = ABL_FPDBT;
    }

    public BigDecimal getABL_PFEQT() {
        return ABL_PFEQT;
    }

    public void setABL_PFEQT(BigDecimal ABL_PFEQT) {
        this.ABL_PFEQT = ABL_PFEQT;
    }

    public BigDecimal getABL_PFMM() {
        return ABL_PFMM;
    }

    public void setABL_PFMM(BigDecimal ABL_PFMM) {
        this.ABL_PFMM = ABL_PFMM;
    }

    public BigDecimal getABL_IFPFDBT() {
        return ABL_IFPFDBT;
    }

    public void setABL_IFPFDBT(BigDecimal ABL_IFPFDBT) {
        this.ABL_IFPFDBT = ABL_IFPFDBT;
    }

    public BigDecimal getABL_IFPFEQ() {
        return ABL_IFPFEQ;
    }

    public void setABL_IFPFEQ(BigDecimal ABL_IFPFEQ) {
        this.ABL_IFPFEQ = ABL_IFPFEQ;
    }

    public BigDecimal getABL_IFPFMM() {
        return ABL_IFPFMM;
    }

    public void setABL_IFPFMM(BigDecimal ABL_IFPFMM) {
        this.ABL_IFPFMM = ABL_IFPFMM;
    }

   
    
    
    
}
