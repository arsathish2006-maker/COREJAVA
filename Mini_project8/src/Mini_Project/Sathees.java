package Mini_Project;
import java.sql.*;
	public class Sathees {
		public static void main(String[] args) throws SQLException {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(Exception e){
				System.out.println(e.toString());
			}		
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satheesh","root","");	
			Statement stmt = con.createStatement();	
			ResultSet rs = stmt.executeQuery("select * from students");	
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ "\t" + rs.getString(2) +"\t"+ rs.getString(3));
		}
		}
	}

