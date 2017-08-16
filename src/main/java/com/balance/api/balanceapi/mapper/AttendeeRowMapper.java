package com.balance.api.balanceapi.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.balance.api.balanceapi.domain.Attendee;

public class AttendeeRowMapper implements RowMapper<Attendee> {
    @Override
    public Attendee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Attendee attendee = new Attendee();
        attendee.setId(rs.getLong("id"));
        attendee.setName(rs.getString("name"));
        attendee.setEmail(rs.getString("email"));
        attendee.setIntoArrears(rs.getBoolean("into_arrears"));
        attendee.setBalance(rs.getDouble("balance"));
        attendee.setOwner(rs.getBoolean("owner"));
        return attendee;
    }
    
}