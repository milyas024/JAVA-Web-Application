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
public class SaleLeadEnt {

    private int leadid;
    private String custname;
    private String mob_no;
    private int mediumid;
    private int periortyid;
    private int regheadid;
    private String gender;
    private String remakrs;

    private int status;
    private int createdby;
    private Date creation_date;
    private int post;
    private int leadtype;
    private String city;
    private String leadsource;
    private int sourceid;
    private String leadmedium;
    private String regionheadname;
    private String city_code;
    private String statusdesc;
    private int closedBy;

    private String spremakrs;
    private String rhremakrs;

    public String getSpremakrs() {
        return spremakrs;
    }

    public void setSpremakrs(String spremakrs) {
        this.spremakrs = spremakrs;
    }

    public String getRhremakrs() {
        return rhremakrs;
    }

    public void setRhremakrs(String rhremakrs) {
        this.rhremakrs = rhremakrs;
    }

    public String getSpstatusdesc() {
        return spstatusdesc;
    }

    public void setSpstatusdesc(String spstatusdesc) {
        this.spstatusdesc = spstatusdesc;
    }
    private String spstatusdesc;

    public int getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(int closedBy) {
        this.closedBy = closedBy;
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLeadsource() {
        return leadsource;
    }

    public void setLeadsource(String leadsource) {
        this.leadsource = leadsource;
    }

    public int getSourceid() {
        return sourceid;
    }

    public void setSourceid(int sourceid) {
        this.sourceid = sourceid;
    }

    public String getLeadmedium() {
        return leadmedium;
    }

    public void setLeadmedium(String leadmedium) {
        this.leadmedium = leadmedium;
    }

    public String getRegionheadname() {
        return regionheadname;
    }

    public void setRegionheadname(String regionheadname) {
        this.regionheadname = regionheadname;
    }

    public int getLeadtype() {
        return leadtype;
    }

    public void setLeadtype(int leadtype) {
        this.leadtype = leadtype;
    }

    public int getLeadid() {
        return leadid;
    }

    public void setLeadid(int leadid) {
        this.leadid = leadid;
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

    public int getMediumid() {
        return mediumid;
    }

    public void setMediumid(int mediumid) {
        this.mediumid = mediumid;
    }

    public int getPeriortyid() {
        return periortyid;
    }

    public void setPeriortyid(int periortyid) {
        this.periortyid = periortyid;
    }

    public int getRegheadid() {
        return regheadid;
    }

    public void setRegheadid(int regheadid) {
        this.regheadid = regheadid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

}
