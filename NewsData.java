/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;

/**
 *
 * @author wasim.abbas
 */
public class NewsData implements Serializable {
     private String newsDesc;
     private String newsSource;
     private String personName;
     private String newsImpact;
     private String newsDate;

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public String getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getNewsImpact() {
        return newsImpact;
    }

    public void setNewsImpact(String newsImpact) {
        this.newsImpact = newsImpact;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }
}
