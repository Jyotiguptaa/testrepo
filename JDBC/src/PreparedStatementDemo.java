import java.sql.*;
import java.io.*;

public class PreparedStatementDemo {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/h2", "root", "root");
		Statement statement = con.createStatement();
			System.out.println("Connection established");
			//Create table
//			String sql= "create table emp130 "+
//						"(id Integer not null,"+
//						"name varchar(233),"+
//						"salary varchar(233),"+
//						"Primary key(id))";
//			
//			statement.executeUpdate(sql);
//		System.out.println("Table created");
		PreparedStatement ps = con.prepareStatement("insert into emp130 values(?,?,?)");
      
		
		//taking values from key boar using io streams
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("enter id:");
			int id = Integer.parseInt(br.readLine());
			System.out.println("enter name:");
			String name = br.readLine();
			System.out.println("enter salary:");
			float salary = Float.parseFloat(br.readLine());

			ps.setInt(1, id);  //first col
			ps.setString(2, name);//second col
			ps.setFloat(3, salary);//third col
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			System.out.println("Do you want to continue: y/n");
			String s = br.readLine();
			if (s.startsWith("n")) {   //yes  'y' or no  'n'
				break;
			}
		} while (true);

		con.close();
	}
}
	