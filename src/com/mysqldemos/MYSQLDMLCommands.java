package com.mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		
		// 1.create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//2.create statement/query
		Statement stmt=con.createStatement();
		
		//String s="INSERT INTO STUDENT VALUES(103,'SMITH',80)";
		//String s="UPDATE STUDENT SET SNAME='DAVID' WHERE SNO=103";
		String s="DELETE FROM STUDENT WHERE SNO=103";
		
		//3.EXECUTE Statement/query
		
		stmt.execute(s);
		
		//4. close a connection
		con.close();
		
		System.out.println("connection closed");

	}

}
