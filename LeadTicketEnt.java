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
public class LeadTicketEnt {

    private int tid;
    private int leadid;
    private int salespersonid;
    private String custname;
    private String mob_no;
    private String instruction;
    private String remakrs;
    private int status;
    private int createdby;
    private Date creation_date;
    private int post;
    private String city;
    private String regionheadname;
    private String salespersonname;
    private int regheadid;

    public int getRegheadid() {
        return regheadid;
    }

    public void setRegheadid(int regheadid) {
        this.regheadid = regheadid;
    }

    public String getSalespersonname() {
        return salespersonname;
    }

    public void setSalespersonname(String salespersonname) {
        this.salespersonname = salespersonname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getLeadid() {
        return leadid;
    }

    public void setLeadid(int leadid) {
        this.leadid = leadid;
    }

    public int getSalespersonid() {
        return salespersonid;
    }

    public void setSalespersonid(int salespersonid) {
        this.salespersonid = salespersonid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getRemakrs() {
        return remakrs;
    }

    public void setRemakrs(String remakrs) {
        this.remakrs = remakrs;
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

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegionheadname() {
        return regionheadname;
    }

    public void setRegionheadname(String regionheadname) {
        this.regionheadname = regionheadname;
    }

}
