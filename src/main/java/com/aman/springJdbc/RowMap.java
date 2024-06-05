package com.aman.springJdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMap implements RowMapper<Guest> {


    @Override
    public Guest mapRow(ResultSet rs, int rowNum) throws SQLException {
        Guest guest = new Guest();
        guest.setGuestId(rs.getInt(1));
        guest.setGuestName(rs.getString(2));
        guest.setContact(rs.getString(3));

        return guest;
    }
}
