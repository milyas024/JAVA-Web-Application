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
public class SalesPerEnt {

    private int salespersonid;
    private String salespersonname;
    private int regheadid;
    private String RegionHeadName;
    private int status;
    private String Empcode;
    private int createdby;
    private Date creation_date;
    private int post;

    public int getSalespersonid() {
        return salespersonid;
    }

    public void setSalespersonid(int salespersonid) {
        this.salespersonid = salespersonid;
    }

    public String getSalespersonname() {
        return salespersonname;
    }

    public void setSalespersonname(String salespersonname) {
        this.salespersonname = salespersonname;
    }

    public int getRegheadid() {
        return regheadid;
    }

    public void setRegheadid(int regheadid) {
        this.regheadid = regheadid;
    }

    public String getRegionHeadName() {
        return RegionHeadName;
    }

    public void setRegionHeadName(String RegionHeadName) {
        this.RegionHeadName = RegionHeadName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmpcode() {
        return Empcode;
    }

    public void setEmpcode(String Empcode) {
        this.Empcode = Empcode;
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

}
