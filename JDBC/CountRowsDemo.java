import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountRowsDemo {

  public static Connection getConnection() throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3380/uttam";
    String username = "root";
    String password = "";

    Class.forName(driver); 
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static int countRows(Connection conn, String tableName) throws SQLException {
    Statement stmt = null;
    ResultSet rs = null;
    int rowCount = -1;
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT COUNT(*) FROM " + tableName);
      rs.next();
      rowCount = rs.getInt(1);
    } finally {
      rs.close();
      stmt.close();
    }
    return rowCount;
  }

  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = getConnection();
      String tableName = "users";
      System.out.println("tableName=" + tableName);
      System.out.println("conn=" + conn);
      System.out.println("rowCount=" + countRows(conn, tableName));
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}