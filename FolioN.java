/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.folio;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class FolioN implements RowMapper{
     @Override
    public folio mapRow(ResultSet rs, int rowNum) throws SQLException {
        folio f = new folio();
        f.setFolioNumber(rs.getString("FOLIO_NUMBER"));
        return f;
    }
}
