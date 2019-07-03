package Dbconnect;
import java.sql.*;
import javax.swing.JOptionPane;
public class Dbc 
{
   
    public static Connection c;
    public static Statement st;
    public static PreparedStatement insertUser;
    public static PreparedStatement updateUser;
    public static PreparedStatement getUser;
    static 
    {
        try
        {
     Class.forName("com.mysql.jdbc.Driver");
     c=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_info","root","vineet");
     st=c.createStatement();
     insertUser=c.prepareStatement("insert into emp_details (name,gender,dob,country,address," + "language) values(?,?,?,?,?,?)");     
     updateUser=c.prepareStatement("update emp_details "+ "set name=?,gender=?,dob=?,country=?,address=?,language=?"+ "where eid=?");
     getUser=c.prepareStatement("select *from emp_details where name like?");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
           
            
        }
    }
}
