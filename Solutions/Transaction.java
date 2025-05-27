import java.sql.*;
public class Transaction {
    public static void transferMoney(int fromId, int toId, double amount) {
        String url = "jdbc:mysql://localhost:3306/account";
        try (Connection con = DriverManager.getConnection(url, "root", "password")) {
            con.setAutoCommit(false);
            try (PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                debit.setDouble(1, amount);
                debit.setInt(2, fromId);
                debit.executeUpdate();
                credit.setDouble(1, amount);
                credit.setInt(2, toId);
                credit.executeUpdate();
                con.commit();
                System.out.println("Transaction Successful");
            } catch (SQLException e) {
                con.rollback();
                System.out.println("Transaction Failed: " + e.getMessage());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        transferMoney(1, 2, 500.00);
    }


    
}
