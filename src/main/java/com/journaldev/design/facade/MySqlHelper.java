package com.journaldev.design.facade;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		System.out.println("MySql PDF Report of " + tableName);
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		System.out.println("MySql HTML Report of " + tableName);
	}
}
