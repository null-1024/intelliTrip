package com.dev.itp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ITPApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(ITPApplication.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(ITPApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("start");

        jdbcTemplate.execute("drop table if exists Users;");
        jdbcTemplate.execute("create table Users" +
                "(id serial," +
                "username varchar(256)," +
                "password varchar(256));");

        List<Object[]> users = Stream.of("a 111", "b 222", "c 333")
                .map(e -> e.split(" "))
                .collect(Collectors.toList());
        users.forEach(user -> log.info("{} {}", user[0], user[1]));

        jdbcTemplate.batchUpdate("insert into Users (username, password) values (?, ?);", users);
        jdbcTemplate.query("select * from Users where id = ?;",
                        (rs, row) -> new User(rs.getLong("id"), rs.getString("username"), rs.getString("password")),
                        "1")
                .forEach(user -> log.info(user.toString()));

        log.info("end");
    }
}
