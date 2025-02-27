import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database_Jdbc_Insert_demo {

	public static void main(String[] args)throws Exception {
		// TO use JDBC(JAVA DATABASE CONNECTIVITY) THERE ARE 4 STEPS
		
		//step 1 load driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 connect with database
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp","root","rajesh");
		
		//step 3 create query
		PreparedStatement ps=con.prepareStatement("insert into whatsappuser values(?,?,?,?)");
		ps.setString(1, "Ayush");
		ps.setString(2, "aaaa");
		ps.setString(3, "ayush@gmail.com");
		ps.setString(4, "Bangalore");
		
		//step 4 how to execute above query
		
		int i=ps.executeUpdate();   //return type of executeUpdate will be int means it will show no of rows affected with query
		//here value of i will be 1 because insert query will create 1 row inside table
		if(i>0) {
			System.out.println("data inserted");
		}
		

	}

}
