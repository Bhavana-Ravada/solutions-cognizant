import java.sql.*;

public class BasicJDBC {
    public static void main(String[] args) throws Exception {
        
        Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","password");
       
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("name"));
        }

        con.close();

    }
    
}
