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
public class EmpTradPolEnt {

private int etpid ;
private Date etpdate ; 
private String securityname ;
private int qtytype ; 
private int qtyamount ; 
private String etptype; 
private String broker ;
private int holdperiod ;
private String requestby ;
private String designation ;
private int status ; 
private int createdby ; 
private Date creationdate ;
private int post ; 
private int agree;
private String etptypedes;
private String qtytypedes;
private int appByComp ; 
private String appByCompName ;
private String appByFundName ;
private String appByCeoName ;
private String symbol; 
private Date appByCompDate ;

private int appByFund ; 
private Date appByFundDate ;

private int appByCeo ; 
private Date appByCeoDate ;

private int rejByFund;
private Date rejByFundDate;
private int rejByCeo;
private Date rejByCeoDate;
private int rejBycomp;
private Date rejByCompDate;
private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getRejBycomp() {
        return rejBycomp;
    }

    public void setRejBycomp(int rejBycomp) {
        this.rejBycomp = rejBycomp;
    }

    public Date getRejByCompDate() {
        return rejByCompDate;
    }

    public void setRejByCompDate(Date rejByCompDate) {
        this.rejByCompDate = rejByCompDate;
    }

    public int getRejByFund() {
        return rejByFund;
    }

    public void setRejByFund(int rejByFund) {
        this.rejByFund = rejByFund;
    }

    public Date getRejByFundDate() {
        return rejByFundDate;
    }

    public void setRejByFundDate(Date rejByFundDate) {
        this.rejByFundDate = rejByFundDate;
    }

    public int getRejByCeo() {
        return rejByCeo;
    }

    public void setRejByCeo(int rejByCeo) {
        this.rejByCeo = rejByCeo;
    }

    public Date getRejByCeoDate() {
        return rejByCeoDate;
    }

    public void setRejByCeoDate(Date rejByCeoDate) {
        this.rejByCeoDate = rejByCeoDate;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getAppByCompName() {
        return appByCompName;
    }

    public void setAppByCompName(String appByCompName) {
        this.appByCompName = appByCompName;
    }

    public String getAppByFundName() {
        return appByFundName;
    }

    public void setAppByFundName(String appByFundName) {
        this.appByFundName = appByFundName;
    }

    public String getAppByCeoName() {
        return appByCeoName;
    }

    public void setAppByCeoName(String appByCeoName) {
        this.appByCeoName = appByCeoName;
    }

    public int getAppByComp() {
        return appByComp;
    }

    public void setAppByComp(int appByComp) {
        this.appByComp = appByComp;
    }

    public Date getAppByCompDate() {
        return appByCompDate;
    }

    public void setAppByCompDate(Date appByCompDate) {
        this.appByCompDate = appByCompDate;
    }

    public int getAppByFund() {
        return appByFund;
    }

    public void setAppByFund(int appByFund) {
        this.appByFund = appByFund;
    }

    public Date getAppByFundDate() {
        return appByFundDate;
    }

    public void setAppByFundDate(Date appByFundDate) {
        this.appByFundDate = appByFundDate;
    }

    public int getAppByCeo() {
        return appByCeo;
    }

    public void setAppByCeo(int appByCeo) {
        this.appByCeo = appByCeo;
    }

    public Date getAppByCeoDate() {
        return appByCeoDate;
    }

    public void setAppByCeoDate(Date appByCeoDate) {
        this.appByCeoDate = appByCeoDate;
    }



    public String getQtytypedes() {
        return qtytypedes;
    }

    public void setQtytypedes(String qtytypedes) {
        this.qtytypedes = qtytypedes;
    }

    public String getEtptypedes() {
        return etptypedes;
    }

    public void setEtptypedes(String etptypedes) {
        this.etptypedes = etptypedes;
    }

    public int getEtpid() {
        return etpid;
    }

    public void setEtpid(int etpid) {
        this.etpid = etpid;
    }

    public Date getEtpdate() {
        return etpdate;
    }

    public void setEtpdate(Date etpdate) {
        this.etpdate = etpdate;
    }

    public String getSecurityname() {
        return securityname;
    }

    public void setSecurityname(String securityname) {
        this.securityname = securityname;
    }

    public int getQtytype() {
        return qtytype;
    }

    public void setQtytype(int qtytype) {
        this.qtytype = qtytype;
    }

    public int getQtyamount() {
        return qtyamount;
    }

    public void setQtyamount(int qtyamount) {
        this.qtyamount = qtyamount;
    }

    public String getEtptype() {
        return etptype;
    }

    public void setEtptype(String etptype) {
        this.etptype = etptype;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public int getHoldperiod() {
        return holdperiod;
    }

    public void setHoldperiod(int holdperiod) {
        this.holdperiod = holdperiod;
    }

    public String getRequestby() {
        return requestby;
    }

    public void setRequestby(String requestby) {
        this.requestby = requestby;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public int getAgree() {
        return agree;
    }

    public void setAgree(int agree) {
        this.agree = agree;
    }
}
