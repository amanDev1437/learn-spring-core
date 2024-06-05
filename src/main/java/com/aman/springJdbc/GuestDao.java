package com.aman.springJdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

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

    public int delete(int guestID){
        String query = "delete from guests where guestId=?";

        return this.jdbcTemplate.update(query,guestID);
    }

    public Guest getGuest(int guestID){
        RowMapper<Guest> rowMapper = new RowMap();

        String query = "select * from guests where guestId=?";

        return this.jdbcTemplate.queryForObject(query,rowMapper,guestID);
    }

    public List<Guest> getAllGuest(){
        String query = "select * from guests";

        return this.jdbcTemplate.query(query, new RowMap());
    }

}
