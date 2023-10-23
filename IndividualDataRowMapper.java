/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.IndividualData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class IndividualDataRowMapper implements RowMapper {
    
    int i=0;
    @Override
    public IndividualData mapRow(ResultSet rs, int rowNum) throws SQLException {
        IndividualData cd = new IndividualData();
      //   System.out.println("Row Mapper "+i++);
      cd.setClientName(rs.getString("CLIENT_NAME"));
      cd.setFolioNumber(rs.getString("FOLIO_NUMBER"));
      cd.setAddress1(rs.getString("ADDRESS1"));
      cd.setNicPassport(rs.getString("NIC_PASSPORT"));
      cd.setPassport(rs.getString("PASSPORT"));
      cd.setStatus(rs.getString("STATUS"));
      cd.setdOB(rs.getDate("DATE_OF_BIRTH"));
      cd.setMinorMajor(rs.getString("MINOR_MAJOR"));
      cd.setFatherHusbName(rs.getString("FATHER_HUSB_NAME"));
     
     return cd;
    }
}