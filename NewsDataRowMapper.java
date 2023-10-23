/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import com.ablamc.entity.NewsData;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author wasim.abbas
 */
public class NewsDataRowMapper implements RowMapper {
    int i=0;
    @Override
    public NewsData mapRow(ResultSet rs, int rowNum) throws SQLException {
        NewsData nd = new NewsData();
     nd.setNewsDesc(rs.getString("NEWS_DESC"));
     nd.setNewsSource(rs.getString("NEWS_SOURCE"));
     nd.setPersonName(rs.getString("PERSON_NAME"));
     nd.setNewsImpact(rs.getString("NEWS_IMAPACT"));
     nd.setNewsDate(rs.getString("NEWS_DATE"));
     return nd;
}
}
