/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.BranchSalesEnt;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class BranchSalesRowMapper implements RowMapper {

    @Override
    public BranchSalesEnt mapRow(ResultSet rs, int rowNum) throws SQLException {
        BranchSalesEnt cd = new BranchSalesEnt();
        cd.setTitle(rs.getString("TITLE"));
        cd.setCnic(rs.getString("CNIC"));
        cd.setCnicExpiryDate(rs.getString("CNIC_EXPIRY_DATE"));
        cd.setPrimary_client(rs.getString("PRIMARY_CLIENT"));
        cd.setAddress(rs.getString("ADDRESS1"));
        cd.setAccountDate(rs.getString("ACCOUNT_DATE"));
        cd.setDateOfBirth(rs.getString("DATE_OF_BIRTH"));
        cd.setPhoneMobile(rs.getString("PHONE_MOBILE"));
        cd.setAccountNumber(rs.getString("ACCOUNT_NUMBER"));
        cd.setFolioNumber(rs.getString("FOLIO_NUMBER"));
        cd.setAccType(rs.getString("STATUS"));
        cd.setCity(rs.getString("CITY"));
//        cd.setBdc(rs.getString("DC_BRANCH_CODE"));
        cd.setBranchName(rs.getString("BRANCH_NAME"));
        cd.setPriceDate(rs.getString("PRICE_DATE"));
        cd.setFundName(rs.getString("FUND_NAME"));
        cd.setQuantity(rs.getBigDecimal("QUANTITY"));
        cd.setAmount(rs.getBigDecimal("AMOUNT"));
        cd.setRiskProduct(rs.getString("RISK_PRODUCT"));
        cd.setRegistationDate(rs.getString("REGISTATION_DATE"));
        cd.setLoadVal(rs.getBigDecimal("LOAD_VAL"));
        cd.setLoadPer(rs.getBigDecimal("LOAD_PER"));
        cd.setPstVal(rs.getBigDecimal("PST_VAL"));
        cd.setSalesLoad(rs.getBigDecimal("SALE_LOAD"));
        return cd;
    }
}
