package br.edu.devmedia.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConfig {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
	    Class.forName("com.mysql.jdbc.Driver");
	    return DriverManager.getConnection("jdbc:mysql://localhost:3306/notes_db", "root", "root");
	}
}
