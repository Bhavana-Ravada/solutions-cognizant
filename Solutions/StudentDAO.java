import java.sql.*;
public class StudentDAO {
    Connection con;
    public StudentDAO() throws SQLException {
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
    }
    public void insertStudent(int id, String name) throws SQLException {
        String query = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
    }
    public void updateStudent(int id, String newName) throws SQLException {
        String query = "UPDATE students SET name=? WHERE id=?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, newName);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
    }
    public static void main(String[] args) throws Exception {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(1, "Renu");
        dao.updateStudent(1, "Renuka");
    }
}

    

