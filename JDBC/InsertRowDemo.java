import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRowDemo {
  public static void main(String[] argv) throws Exception {
    String driverName = "com.mysql.jdbc.Driver";
    Class.forName(driverName);

    String url = "jdbc:mysql://localhost:3380/uttam";
    String username = "root";
    String password = "";

    Connection connection = DriverManager.getConnection(url, username, password);
    Statement stmt = connection.createStatement();
    String sql = "INSERT INTO user(id,name,address,phoneno) VALUES(147,'shivam','Pithampur',124332)";

    stmt.executeUpdate(sql);
  }
}
