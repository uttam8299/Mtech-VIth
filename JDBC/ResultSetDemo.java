import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
  public static Connection getConnection() throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3380/uttam";
    String username = "root";
    String password = "";

    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conn = getConnection();
      System.out.println("conn=" + conn);
      // prepare query
      String query = "select id, username, address from users";
      // create a statement
      stmt = conn.createStatement();
      // execute query and return result as a ResultSet
      rs = stmt.executeQuery(query);
      // extract data from the ResultSet
      while (rs.next()) {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        String addr = rs.getString(3);
        System.out.println("id=" + id);
        System.out.println("username=" + name);
        System.out.println("address=" + addr);
        System.out.println("---------------");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    } finally {
      // release database resources
      try {
        rs.close();
        stmt.close();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}