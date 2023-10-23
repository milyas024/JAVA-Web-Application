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
public class TopNavEnt {
    private int nav;
    private String fundname;
    private Date nav_date;

    public int getNav() {
        return nav;
    }

    public void setNav(int nav) {
        this.nav = nav;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname;
    }

    public Date getNav_date() {
        return nav_date;
    }

    public void setNav_date(Date nav_date) {
        this.nav_date = nav_date;
    }
}
