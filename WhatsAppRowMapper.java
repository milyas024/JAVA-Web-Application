/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;


import com.ablamc.entity.WhatsAppEnt;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class WhatsAppRowMapper implements RowMapper {
    
   
     @Override
    public WhatsAppEnt mapRow(ResultSet rs, int rowNum) throws SQLException {
        WhatsAppEnt rp = new WhatsAppEnt();
         rp.setCnic(rs.getString("CNIC")); 
        rp.setPhoneNumber(rs.getString("PHONE_NUMBER")); 
        rp.setRegistrationDate(rs.getDate("REGISTRATION_DATE"));
        rp.setTitle(rs.getString("Title"));
        
       return rp;
               }
}
