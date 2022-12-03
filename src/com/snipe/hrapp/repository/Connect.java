package com.snipe.hrapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.snipe.hrapp.constants.Constants;

public class Connect {
	
static Connection getConnection() throws SQLException,ClassNotFoundException{
	
	Class.forName(Constants.DB_DRIVER);
	return DriverManager.getConnection(Constants.DB_URL,Constants.DB_USERNAME,Constants.DB_PWD);
}	
}
