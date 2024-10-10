package jdbc_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC_CONNECTIVITY{
 public static void main(String[] args){
 try
 {
 Class.forName("org.apache.derby.jdbc.ClientDriver");
 System.out.println("Driver registered successfully");
 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/test","test","test");
 System.out.println("Database connection successfully");
 Statement stmt=con.createStatement();
 ResultSet rs=stmt.executeQuery("select * from SYCS");
 while(rs.next())
 {
 System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3));
 }
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}