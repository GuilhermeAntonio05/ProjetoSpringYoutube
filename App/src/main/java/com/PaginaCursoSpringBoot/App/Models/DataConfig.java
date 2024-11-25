package com.PaginaCursoSpringBoot.App.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DataConfig {

	public static void main(String[] args) throws SQLException {
		Properties props = new Properties();
		String url = "jdbc:postegresql://localhost:5432/PaginaCursoSpringBoot";
		props.setProperty("user", "postegres");
		props.setProperty("password", "1234");
		props.setProperty("ssl", "true");
		
		Connection conn = DriverManager.getConnection(url,props);
		
		conn.setAutoCommit(false);
		
	}
}
