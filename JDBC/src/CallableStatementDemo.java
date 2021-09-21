import java.sql.*;


// Create or replace procedure "employe"  
//           (id IN NUMBER,name IN VARCHAR,salary In VARCHAR)  
//        is
//           begin  
//               insert into emp130 values(id,name,salary);  
//       end;  
///

public class CallableStatementDemo {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/h2", "root", "root");
System.out.println("database connected");

		CallableStatement stmt = con.prepareCall("{call employe(?,?,?)}");  //callablestatemnt
		stmt.setInt(1,10);
		stmt.setString(2, "Amit");
		stmt.setString(3, "50000");
		stmt.execute();
//{call insertR(?,?,?)}
		System.out.println("success");
	}
}