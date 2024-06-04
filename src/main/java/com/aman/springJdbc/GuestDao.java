package com.aman.springJdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class GuestDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public int insert(Guest guest){
        String query = "insert into guests (guestName,contactNumber) values(?,?)";

        return this.jdbcTemplate.update(query,guest.getGuestName(),guest.getContact());
    }

    public int change(Guest guest){

        String query = "update guests set guestName=? where guestId= ?";

        return this.jdbcTemplate.update(query,guest.getGuestName(),guest.getGuestId());
    }

    public int delete(Guest guest){
        String query = "delete from guests where guestId=?";

        return this.jdbcTemplate.update(query,guest.getGuestId());
    }


}
