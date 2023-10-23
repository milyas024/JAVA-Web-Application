/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.util.Date;

/**
 *
 * @author wasim.abbas
 */
public class KycRevEnt {

    private int revid;
    private Date revdate;
    private String revremk;
    private int createdby;
    private String folionumber;
    private String title;
    private Date creationDate;
    private String riksCatCft;
    
    private String riksCatPrd;
    private String userName;
    private String accountType;
    private String natureType;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getNatureType() {
        return natureType;
    }

    public void setNatureType(String natureType) {
        this.natureType = natureType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRiksCatCft() {
        return riksCatCft;
    }

    public void setRiksCatCft(String riksCatCft) {
        this.riksCatCft = riksCatCft;
    }

    public String getRiksCatPrd() {
        return riksCatPrd;
    }

    public void setRiksCatPrd(String riksCatPrd) {
        this.riksCatPrd = riksCatPrd;
    }
    
    
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolionumber() {
        return folionumber;
    }

    public void setFolionumber(String folionumber) {
        this.folionumber = folionumber;
    }

    public int getRevid() {
        return revid;
    }

    public void setRevid(int revid) {
        this.revid = revid;
    }

    public Date getRevdate() {
        return revdate;
    }

    public void setRevdate(Date revdate) {
        this.revdate = revdate;
    }

    public String getRevremk() {
        return revremk;
    }

    public void setRevremk(String revremk) {
        this.revremk = revremk;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }
}
