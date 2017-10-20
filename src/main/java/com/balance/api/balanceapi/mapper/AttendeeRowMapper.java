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
        attendee.setFirstname(rs.getString("firstname"));
        attendee.setLastname(rs.getString("lastname"));
        attendee.setEmail(rs.getString("email"));
        return attendee;
    }
    
}