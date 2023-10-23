/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.MarketeValueData;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class MarketeValueRowMapper implements RowMapper {

    @Override
    public MarketeValueData mapRow(ResultSet rs, int rowNum) throws SQLException {
        MarketeValueData mv = new MarketeValueData();
        mv.setSymbol(rs.getString("SYMBOL"));
        mv.setFundName(rs.getString("FUND_NAME"));
        mv.setMarketRate(rs.getBigDecimal("MARKET"));
        mv.setPriceDate(String.valueOf(rs.getDate("PRICE_DATE")));
        return mv;
    }
}
