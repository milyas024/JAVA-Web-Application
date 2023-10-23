/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author wasim.abbas
 */
public class MarketeValueData implements Serializable {
 private String    priceDate;

 private BigDecimal  marketRate;

    public BigDecimal getMarketRate() {
        return marketRate;
    }

    public void setMarketRate(BigDecimal marketRate) {
        this.marketRate = marketRate;
    }

    
 private String symbol;
 private String fundName;

    public String getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(String priceDate) {
        this.priceDate = priceDate;
    }

  

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
}
