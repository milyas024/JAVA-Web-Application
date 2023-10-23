/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.PortoFolioEnt;
import com.ablamc.entity.riskProfile;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class PortoFolioDataRowMapper implements RowMapper  {
     @Override
    public PortoFolioEnt mapRow(ResultSet rs, int rowNum) throws SQLException {
        PortoFolioEnt rp = new PortoFolioEnt();
        rp.setSchemeType(rs.getString("Scheme_Type")); 
        rp.setSchemeIssueDesc(rs.getString("scheme_issue_desc")); 
        rp.setFundName(rs.getString("fund_name")); 
        rp.setBroker(rs.getString("broker")); 
        rp.setCounterParty(rs.getString("counter_party")); 
        rp.setTransDate(rs.getDate("trans_date")); 
        rp.setSetDate(rs.getDate("set_date"));
        rp.setTransType(rs.getString("trans_type")); 
        rp.setBrokerageRate(rs.getDouble("brokerage_rate")); 
        rp.setBrokerage(rs.getDouble("brokerage")); 
        rp.setBuySell(rs.getString("buy_or_sell")); 
        rp.setPostedVoucher(rs.getString("posted_in_voucher")); 
        rp.setFisSecurityType(rs.getString("fis_security_type")); 
        rp.setCustodyorsgl(rs.getDouble("custodyorsgl")); 
        rp.setFaceValue(rs.getDouble("face_value")); 
        rp.setPrice(rs.getDouble("price")); 
        rp.setPremiumDiscount(rs.getDouble("premium_discount")); 
        rp.setYield(rs.getDouble("yield")); 
        rp.setYieldMaturity(rs.getDouble("yield_to_maturity")); 
        rp.setQuantity(rs.getDouble("quantity")); 
        rp.setTransactedAmount(rs.getDouble("TRANSACTED_AMOUNT")); 
        rp.setAccrudeAmount(rs.getDouble("ACCRUDE_AMOUNT")); 
        rp.setnOfDays(rs.getDouble("NO_OF_DAYS"));
        rp.setCouponRate(rs.getDouble("COUPON_RATE"));
        rp.setLastCouponDate(rs.getDate("LAST_COUPON_DATE"));
        rp.setNextCouponDate(rs.getDate("NEXT_COUPON_DATE"));
        rp.setSchemeMaturityDate(rs.getDate("SCHEME_MATURITY_DATE"));
       return rp;
               }
}

