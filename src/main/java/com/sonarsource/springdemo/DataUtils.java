package com.sonarsource.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataUtils {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getAddress(String name) {
        String query = "SELECT address FROM people WHERE name = ?";
        return jdbcTemplate.queryForObject(query, String.class, name);
    }      
}