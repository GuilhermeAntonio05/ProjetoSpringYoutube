package com.PaginaCursoSpringBoot.App.Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class DataConfig {
	Properties props = new Properties();
	private String url = "jdbc:postegresql://localhost:5432/PaginaCursoSpringBoot";
	private String user = "postegres";
	private String password = "1234";
	
	
	Connection conn = DriverManager.getConnection(url, user, password);
}
