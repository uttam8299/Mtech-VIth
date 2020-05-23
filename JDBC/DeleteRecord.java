import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {
  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost:3380/uttam";
    String username = "root";
    String password = "";

    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);

    String sql = "DELETE FROM users WHERE id = ?";
    int userId = 143;

    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setInt(1, userId);

    int rows = statement.executeUpdate();

    System.out.println(rows + " record(s) deleted.");
    connection.close();
  }
}