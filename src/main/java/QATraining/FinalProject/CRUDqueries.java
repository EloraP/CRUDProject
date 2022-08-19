package QATraining.FinalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CRUDqueries {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public CRUDqueries() {
		try {
			conn = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PASS);
			this.stmt = conn.createStatement();// create a statement object to execute sql queries
			System.out.println("Connection Successful!");
		} catch (SQLException e) {
			System.out.println("Incorrect credentials");
			e.printStackTrace();
		}
	}
	
	public void create() {
		
		System.out.println("Create");
		}
	
	public void viewAll() {
		System.out.println("read");
	}
	
	public void update() {
		System.out.println("update");
	}
	
	public void delete() {
		System.out.println("delete");
	}

}