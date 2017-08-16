package com.balance.api.balanceapi.service;

import com.balance.api.balanceapi.domain.TriCount;
import com.balance.api.balanceapi.domain.Attendee;

import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;;

@Service
public class TriCountService implements ITriCountService {
    
    @Autowired
    private JdbcTemplate jtm;

    @Override
    public boolean saveTriCount(TriCount triCount) {
        String sql = "INSERT INTO tri_count (title, currency, description) VALUES (?, ?, ?)";
        return jtm.update(sql, new Object[] {triCount.getTitle(), triCount.getCurrency(), triCount.getDescription()}) > 0;
    }

    @Override
    public List<TriCount> findAll() {
        StringBuilder sql = new StringBuilder("");
        sql.append("SELECT tcts.id, tcts.title, tcts.currency, tcts.description ");
        sql.append("FROM tri_counts tcts ");
        
        return (List<TriCount>)jtm.query(sql.toString(), new RowMapper<TriCount>(){
            @Override
            public TriCount mapRow(ResultSet rs, int rowNum) throws SQLException {
                
                TriCount triCount = new TriCount(   rs.getLong("id"),
                                                    rs.getString("title"), 
                                                    rs.getString("currency"),
                                                    rs.getString("description"));
                                                
                return triCount;
            }
        });
    }

}