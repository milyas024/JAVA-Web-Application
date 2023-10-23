/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wasim.abbas
 */
package com.ablamc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NccplModel {

    private Date trDate;
    private Date trDatetime;
    private Date invDate;
    private BigDecimal trfId;

    private BigDecimal seqNo;
    private String trType;
    private String trCode;
    private String fundCode;
    private String amcNccCode;
    private String uin;
    private String fromFolioNo;
    private BigDecimal price;
    private BigDecimal volume;
    private int status;
    private String contTrId;
    private String investorRefId;
    private String userId;
    private String date;
    private BigDecimal gainLoss;
    private BigDecimal cgtAmount;
    private BigDecimal accBalBefore;
    private BigDecimal accBalAfter;
    private BigDecimal totCgt;
    private BigDecimal totProfitLoss;
    private BigDecimal totValout;
    private BigDecimal totUnitout;
    private BigDecimal totoutTr;
    private BigDecimal totValInTr;
    private BigDecimal totUnitInTr;
    private int totInTr;
    private String dividend;
    private String month;
    private int year;
    private String emialAddress;
    private String remarks;
    private String accName;
    private String ntnNo;
    private String uinCategory;
    private String taxExemptedAndNa;
    private String taxExemptedReason;
    private Date rdaApplicableDate;
    private String rdaComplianceDoc;
    private String uinCategor;
    private String ntn;
    private String clientName;
    private String taxExempted;
    private String minorFlag;
    private String rdaCompDoc;
    private String rdaFlag;
    private BigDecimal amount;
    private String trusteeNccId;
    private String amcName;
    private String fundName;
    private String fundType;
    private String fundSector;
    private String category;
    private String pkId;
    private String nccplRemarks;

    public String getNccplRemarks() {
        return nccplRemarks;
    }

    public void setNccplRemarks(String nccplRemarks) {
        this.nccplRemarks = nccplRemarks;
    }
    

    private Date rdaAppDate;

    public Date getRdaAppDate() {
        return rdaAppDate;
    }

    public void setRdaAppDate(Date rdaAppDate) {
        this.rdaAppDate = rdaAppDate;
    }

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getTrusteeNccId() {
        return trusteeNccId;
    }

    public void setTrusteeNccId(String trusteeNccId) {
        this.trusteeNccId = trusteeNccId;
    }

    public String getAmcName() {
        return amcName;
    }

    public void setAmcName(String amcName) {
        this.amcName = amcName;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getFundSector() {
        return fundSector;
    }

    public void setFundSector(String fundSector) {
        this.fundSector = fundSector;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getNtnNo() {
        return ntnNo;
    }

    public void setNtnNo(String ntnNo) {
        this.ntnNo = ntnNo;
    }

    public String getUinCategory() {
        return uinCategory;
    }

    public void setUinCategory(String uinCategory) {
        this.uinCategory = uinCategory;
    }

    public String getTaxExemptedAndNa() {
        return taxExemptedAndNa;
    }

    public void setTaxExemptedAndNa(String taxExemptedAndNa) {
        this.taxExemptedAndNa = taxExemptedAndNa;
    }

    public String getTaxExemptedReason() {
        return taxExemptedReason;
    }

    public void setTaxExemptedReason(String taxExemptedReason) {
        this.taxExemptedReason = taxExemptedReason;
    }

    public Date getRdaApplicableDate() {
        return rdaApplicableDate;
    }

    public void setRdaApplicableDate(Date rdaApplicableDate) {
        this.rdaApplicableDate = rdaApplicableDate;
    }

    public String getRdaComplianceDoc() {
        return rdaComplianceDoc;
    }

    public void setRdaComplianceDoc(String rdaComplianceDoc) {
        this.rdaComplianceDoc = rdaComplianceDoc;
    }

    public Date getTrDate() {
        return trDate;
    }

    public void setTrDate(Date trDate) {
        this.trDate = trDate;
    }

    public Date getTrDatetime() {
        return trDatetime;
    }

    public void setTrDatetime(Date trDatetime) {
        this.trDatetime = trDatetime;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public BigDecimal getTrfId() {
        return trfId;
    }

    public void setTrfId(BigDecimal trfId) {
        this.trfId = trfId;
    }

    public BigDecimal getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    public String getTrType() {
        return trType;
    }

    public void setTrType(String trType) {
        this.trType = trType;
    }

    public String getTrCode() {
        return trCode;
    }

    public void setTrCode(String trCode) {
        this.trCode = trCode;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getAmcNccCode() {
        return amcNccCode;
    }

    public void setAmcNccCode(String amcNccCode) {
        this.amcNccCode = amcNccCode;
    }

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin;
    }

    public String getFromFolioNo() {
        return fromFolioNo;
    }

    public void setFromFolioNo(String fromFolioNo) {
        this.fromFolioNo = fromFolioNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContTrId() {
        return contTrId;
    }

    public void setContTrId(String contTrId) {
        this.contTrId = contTrId;
    }

    public String getInvestorRefId() {
        return investorRefId;
    }

    public void setInvestorRefId(String investorRefId) {
        this.investorRefId = investorRefId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getGainLoss() {
        return gainLoss;
    }

    public void setGainLoss(BigDecimal gainLoss) {
        this.gainLoss = gainLoss;
    }

    public BigDecimal getCgtAmount() {
        return cgtAmount;
    }

    public void setCgtAmount(BigDecimal cgtAmount) {
        this.cgtAmount = cgtAmount;
    }

    public BigDecimal getAccBalBefore() {
        return accBalBefore;
    }

    public void setAccBalBefore(BigDecimal accBalBefore) {
        this.accBalBefore = accBalBefore;
    }

    public BigDecimal getAccBalAfter() {
        return accBalAfter;
    }

    public void setAccBalAfter(BigDecimal accBalAfter) {
        this.accBalAfter = accBalAfter;
    }

    public BigDecimal getTotCgt() {
        return totCgt;
    }

    public void setTotCgt(BigDecimal totCgt) {
        this.totCgt = totCgt;
    }

    public BigDecimal getTotProfitLoss() {
        return totProfitLoss;
    }

    public void setTotProfitLoss(BigDecimal totProfitLoss) {
        this.totProfitLoss = totProfitLoss;
    }

    public BigDecimal getTotValout() {
        return totValout;
    }

    public void setTotValout(BigDecimal totValout) {
        this.totValout = totValout;
    }

    public BigDecimal getTotUnitout() {
        return totUnitout;
    }

    public void setTotUnitout(BigDecimal totUnitout) {
        this.totUnitout = totUnitout;
    }

    public BigDecimal getTotoutTr() {
        return totoutTr;
    }

    public void setTotoutTr(BigDecimal totoutTr) {
        this.totoutTr = totoutTr;
    }

    public BigDecimal getTotValInTr() {
        return totValInTr;
    }

    public void setTotValInTr(BigDecimal totValInTr) {
        this.totValInTr = totValInTr;
    }

    public BigDecimal getTotUnitInTr() {
        return totUnitInTr;
    }

    public void setTotUnitInTr(BigDecimal totUnitInTr) {
        this.totUnitInTr = totUnitInTr;
    }

    public int getTotInTr() {
        return totInTr;
    }

    public void setTotInTr(int totInTr) {
        this.totInTr = totInTr;
    }

    public String getDividend() {
        return dividend;
    }

    public void setDividend(String dividend) {
        this.dividend = dividend;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmialAddress() {
        return emialAddress;
    }

    public void setEmialAddress(String emialAddress) {
        this.emialAddress = emialAddress;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUinCategor() {
        return uinCategor;
    }

    public void setUinCategor(String uinCategor) {
        this.uinCategor = uinCategor;
    }

    public String getNtn() {
        return ntn;
    }

    public void setNtn(String ntn) {
        this.ntn = ntn;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTaxExempted() {
        return taxExempted;
    }

    public void setTaxExempted(String taxExempted) {
        this.taxExempted = taxExempted;
    }

    public String getMinorFlag() {
        return minorFlag;
    }

    public void setMinorFlag(String minorFlag) {
        this.minorFlag = minorFlag;
    }

    public String getRdaCompDoc() {
        return rdaCompDoc;
    }

    public void setRdaCompDoc(String rdaCompDoc) {
        this.rdaCompDoc = rdaCompDoc;
    }

    public String getRdaFlag() {
        return rdaFlag;
    }

    public void setRdaFlag(String rdaFlag) {
        this.rdaFlag = rdaFlag;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
