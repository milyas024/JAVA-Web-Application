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
public class RegionalHeadEnt {

    private int RegheadId;
    private String RegionHeadName;
    private String Empcode;
    private String RegionCode;   
    private int Status;
    private int CreatedBy;
    private int post;
    private String  regionName;
    private Date CreationDate;
    

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date CreationDate) {
        this.CreationDate = CreationDate;
    }
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
  public String getRegionCode() {
        return RegionCode;
    }

    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }
    public String getEmpcode() {
        return Empcode;
    }

    public void setEmpcode(String Empcode) {
        this.Empcode = Empcode;
    }

    public int getRegheadId() {
        return RegheadId;
    }

    public void setRegheadId(int RegheadId) {
        this.RegheadId = RegheadId;
    }

    public String getRegionHeadName() {
        return RegionHeadName;
    }

    public void setRegionHeadName(String RegionHeadName) {
        this.RegionHeadName = RegionHeadName;
    }

   

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public int getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(int CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

}
