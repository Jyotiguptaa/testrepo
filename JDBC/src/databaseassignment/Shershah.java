package databaseassignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Shershah {
	public static void main(String[] args)
	{
		Connection connection = null;
        final String username = "root";
        final String password = "root";
        final String jdbcurl = "jdbc:mysql://localhost:3306/jdbcdemo";
        String selectsql = "";
        try {

        	 

            Class.forName("com.mysql.cj.jdbc.Driver"); ///

 

            connection = DriverManager.getConnection(jdbcurl,username,password);///authentication
            
            Statement statement = connection.createStatement();
            System.out.println("connected...");
            //create table
            
            String sql="CREATE TABLE emp "+
            "(empno number(4,0),"+
             "ename varchar (10),"+
            "job varchar2(9),"+
           " mgr number(4,0),"+
            "hiredate date,"+
           "sal number(7,2),"+
            "comm number(7,2),"+
           "deptno number(2,0),"+
            "PRIMARY KEY(empno)"+
           "FOREIGN KEY (deptno)"+
           "REFERENCES dept(deptno)";
        
            statement.executeUpdate(sql);
            System.out.println("table created");
        }
        catch (Exception e)        
        {
        	e.printStackTrace(); 
        }
	}
	}