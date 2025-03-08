package com.gdinesh.persistence;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gdinesh.persistence.jdbc.JDBCDriverPractice;

@SpringBootApplication
public class PersistenceApplication {
	
	private static JDBCDriverPractice practice = new JDBCDriverPractice();
	
	public static void main(String[] args) {
		SpringApplication.run(PersistenceApplication.class, args);
		try {
			practice.tinker();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
