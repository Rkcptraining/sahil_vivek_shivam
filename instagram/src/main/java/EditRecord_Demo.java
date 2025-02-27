import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EditRecord_Demo {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp","root","rajesh");
		
		PreparedStatement ps=con.prepareStatement("update whatsappuser set address=? where name=?");
		ps.setString(1, "Pune");
		ps.setString(2, "Sahil");
		
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("profile edited");
		}

	}

}
