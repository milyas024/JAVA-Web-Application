/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.StackEnt;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class StackRowMapper implements RowMapper {
     @Override
    public StackEnt mapRow(ResultSet rs, int rowNum) throws SQLException {
        StackEnt rp = new StackEnt();
       rp.setStackid(rs.getInt("STACK_ID")); 
        rp.setFundCode(rs.getString("FUND_CODE")); 
        rp.setSchemeCode(rs.getString("SCHEME_CODE"));
        rp.setSchemeIssueDate(rs.getDate("SCHEME_ISSUE_DATE"));
        rp.setBuyContractNum(rs.getString("BUY_CONTRACT_NUM"));
        rp.setSelContractNum(rs.getString("SEL_CONTRACT_NUM"));
        rp.setBuyQuantity(rs.getBigDecimal("BUY_QUANTITY"));
        rp.setSelQuantity(rs.getBigDecimal("SEL_QUANTITY"));
        rp.setBalance(rs.getBigDecimal("BALANCE"));
       return rp;
               }
}
