/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.MenuData;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class MenuDataRowMapper implements RowMapper {
    int i=0;
    @Override
    public MenuData mapRow(ResultSet rs, int rowNum) throws SQLException {
        MenuData md = new MenuData();
     md.setMenuId(rs.getInt("MENUID"));
     md.setMenuDesc(rs.getString("MENUDESC"));
     md.setParentid(rs.getInt("PARENTID"));
     md.setMenuLocation(rs.getString("MENULOCATION"));
     return md;
}
}


