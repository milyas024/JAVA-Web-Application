/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.Coopratedata;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class CooprateDataRowMapper  implements RowMapper {
    
    @Override
    public Coopratedata mapRow(ResultSet rs, int rowNum) throws SQLException {
        Coopratedata cd = new Coopratedata();
        cd.setTitle(rs.getString("TITLE"));
      cd.setFolioNumber(rs.getString("FOLIO_NUMBER"));
      cd.setName(rs.getString("NAME"));
      cd.setDesignation(rs.getString("DESIGNATION"));
      cd.setCategoryOfSignatory(rs.getString("CATEGORY_OF_SIGNATORY"));
      cd.setNicPassport(rs.getString("NIC_PASSPORT"));
      cd.setCnicIssueDate(rs.getDate("CNIC_ISSUE_DATE"));
      cd.setCnicExpiryDate(rs.getDate("CNIC_EXPIRY_DATE"));
      cd.setDateOfBirth(rs.getDate("DATE_OF_BIRTH"));
      cd.setCountryOfBirth(rs.getString("COUNTRY_OF_BIRTH"));
      cd.setNationality(rs.getString("NATIONALITY"));
      cd.setPhoneNo(rs.getString("PHONE_ONE"));
      cd.setEmail(rs.getString("EMAIL"));
      cd.setStatus(rs.getString("STATUS"));
      cd.setPep(rs.getString("PEP"));
      cd.setSigRemarks(rs.getString("SIG_REMARKS"));
     
     return cd;
    }
}
//UA., C.CLIENT_NAME,C.REGISTRATION_NO,S.NAME,S.,S.NIC_PASSPORT,DECODE(S.STATUS, '0', 'INACTIVE', 'ACTIVE') STATUS
