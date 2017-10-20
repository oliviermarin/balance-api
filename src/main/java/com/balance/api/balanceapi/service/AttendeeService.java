package com.balance.api.balanceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.balance.api.balanceapi.domain.Attendee;
import com.balance.api.balanceapi.mapper.AttendeeRowMapper;

@Service
public class AttendeeService implements IAttendeeService {
	
	@Autowired
	private JdbcTemplate jtm;

	@Override
  	public List<Attendee> findAll () {
  		String sql = "SELECT atds.id, atds.firstname, atds.lastname, atds.email FROM attendees atds";
		return (List<Attendee>)jtm.query(sql, new AttendeeRowMapper());
	}
	
	@Override
	public Attendee findById (Long id) {
		String sql = "SELECT atds.id, atds.firstname, atds.lastname, atds.email FROM attendees atds WHERE atds.id = ?";
		return (Attendee)jtm.queryForObject(sql, new AttendeeRowMapper(), id);
	}

	@Override
	public List<Attendee> findByTriCountId ( Long triCountId ) {
		String sql = "SELECT atds.id, atds.firstname, atds.lastname, atds.email FROM attendees atds WHERE atds.tricount_id = ?";
		return (List<Attendee>)jtm.query(sql, 
		new Object[]{triCountId},
		new AttendeeRowMapper());
	}
}
