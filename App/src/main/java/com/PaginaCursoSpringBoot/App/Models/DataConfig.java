package com.PaginaCursoSpringBoot.App.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataConfig {

	public String test() throws SQLException {
		Properties props = new Properties();
		String url = "jdbc:postgresql://localhost:5432/PaginaCursoSpringBoot";
		props.setProperty("user", "postgres");
		props.setProperty("password", "1234");
		props.setProperty("ssl", "true");

		Connection conn = DriverManager.getConnection(url, props);

		// conn.setAutoCommit(false);
		return null;
	}

}
