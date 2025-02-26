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
		ps.setString(1, "Shubham");
		ps.setString(2, "shsh");
		ps.setString(3, "Shubham@gmail.com");
		ps.setString(4, "Chiraiyakot");
		
		//step 4 how to execute above query
		
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("data inserted");
		}
		

	}

}
