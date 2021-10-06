package com.tutorialsdojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

/**
 * How to connect to a mySQL Database.
 * 
 * @author Jon Bonso
 *
 */
public class DatabaseConnection {

	public static void main(String[] args) {
		try {
			connectToDB();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	

	/**
	 * Connect to MySQL Database
	 * @throws SQLException
	 */
	private static void connectToDB() throws SQLException{
		
		// 1. Get the Connection instance using the DriverManager.getConnection() method 
		//    with your MySQL Database Credentails
    
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorialsdojo",
				"tutorialsdojo", "P@sSword123");
		
		System.out.println("LOG: Connection Established!");
		
		// 2. Execute your SQL Query using conn.createStatement.executeQuery() 
		//    and get the result as a ResultSet object.
		//    with your MySQL Database Credentails
    
		ResultSet rs   = conn.createStatement().executeQuery("select now()");
		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.println("Query Results: \n\n");
		
		// Show Column Names
		getColumnNames(rsmd);
		
		// Getting the Results
		while (rs.next()){
			for ( int i=1; i <= rsmd.getColumnCount(); i++){;
				System.out.print(rs.getString(i) + "\t\t");
			}

			System.out.println();
		}
	}
	
	/**
	 * Shows the Column Names
	 * @param rs
	 * @throws SQLException
	 */
	private static void getColumnNames(ResultSetMetaData rsmd) throws SQLException{
		// Getting the list of COLUMN Names
		for ( int i=1; i <= rsmd.getColumnCount(); i++){
			System.out.print(rsmd.getColumnName(i) + "\t\t|");	
		}

		System.out.println("");
	}
}
