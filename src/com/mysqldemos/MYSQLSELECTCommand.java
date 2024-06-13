package com.mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLSELECTCommand {

	public static void main(String[] args) throws SQLException {
		
		// 1.create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		
		//2.create statement/query
		Statement stmt=con.createStatement();
		
		String s="SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME FROM EMPLOYEES";
		
		//3.EXECUTE Statement/query
		
		ResultSet rSet= stmt.executeQuery(s);
		
		while(rSet.next()) {
		int employeeID=rSet.getInt("EMPLOYEE_ID");
		String firstname=rSet.getString("FIRST_NAME");
		String lastname=rSet.getString("LAST_NAME");
		
		System.out.println(employeeID+"  "+firstname+"  "+lastname);
		}
		
		
		//4.STORE DATA IN RESULT SET
		
		//5. close a connection
		con.close();
		
		System.out.println("connection closed");

	}

}
