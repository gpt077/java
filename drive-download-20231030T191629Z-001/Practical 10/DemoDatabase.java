package demodatabase;

import java.sql.*;
public class DemoDatabase{
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/emp1","sycsa1","sycsa1");
       String sql = "insert into emp values(?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setInt(1,101);
       ps.setString(2,"Ram");
       ps.setInt(3,903904590);
       
       ps.executeUpdate();
       con.close();  
    }
}



