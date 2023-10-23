/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.FolioBalance;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class FolioBalanceRowMapper implements RowMapper {
    
    @Override
    public FolioBalance mapRow(ResultSet rs, int rowNum) throws SQLException {
        FolioBalance fb = new FolioBalance();
        fb.setAvailableAmount(String.valueOf(rs.getBigDecimal("AVAILABLE_AMOUNT")));
        
        fb.setPlanName(rs.getString("PLAN_NAME"));
        fb.setFundShortName(rs.getString("FUND_SHORT_NAME"));
        fb.setFundName(rs.getString("FUND_NAME"));
        fb.setCnic(rs.getString("CNIC"));
        fb.setFolioNumber(String.valueOf(rs.getString("FOLIO_NUMBER")));
        fb.setClosingDate(String.valueOf(rs.getDate("CLOSING_DATE")));
        fb.setNavDate(String.valueOf(rs.getString("NAVDATE")));
        fb.setUnits(String.valueOf(rs.getBigDecimal("UNITS")));
        fb.setNavPrice(String.valueOf(rs.getBigDecimal("NAVPRICE")));
        return fb;
    }
    
}

