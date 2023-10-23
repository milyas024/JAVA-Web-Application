/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.riskProfile;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class riskProfilerRowMapper implements RowMapper {
    
   
     @Override
    public riskProfile mapRow(ResultSet rs, int rowNum) throws SQLException {
        riskProfile rp = new riskProfile();
        rp.setAcountType(rs.getString("Acount_Type")); 
        rp.setClientName(rs.getString("client_name")); 
        rp.setFolionumber(rs.getString("folio_number"));
        rp.seteMail(rs.getString("E_MAIL"));
        rp.setRiskProduct(rs.getString("risk_product"));
       return rp;
               }
}

