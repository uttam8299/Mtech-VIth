import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInstallationCheck {
  public static Connection getConnection() throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3380/uttam";
    String username = "root";
    String password = "";
    Class.forName(driver); // load MySQL driver
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static boolean isValidConnection(Connection conn) throws Exception {
    if (conn == null) {
      // null connection object is not valid
      return false;
    }

    if (conn.isClosed()) {
      // closed connection object is not valid
      return false;
    }

    return testConnection(conn, "select 1");
  }

  public static boolean testConnection(Connection conn, String query) {

    ResultSet rs = null;
    Statement stmt = null;
    try {
      stmt = conn.createStatement();
      if (stmt == null) {
        return false;
      }

      rs = stmt.executeQuery(query);
      if (rs == null) {
        return false;
      }

      if (rs.next()) {
        return true;
      }

      return false;

    } catch (Exception e) {
      //
      // something went wrong: connection is bad
      //
      return false;
    } finally {
      try {
        rs.close();
        stmt.close();
        conn.close();
      } catch (Exception e) {
      }
    }
  }

  public static void main(String[] args) {

    Connection conn = null;
    try {
      conn = getConnection();
      System.out.println("conn=" + conn);
      System.out.println("valid connection = " + isValidConnection(conn));
    } catch (Exception e) {
      // handle the exception
      e.printStackTrace();
      System.exit(1);
    } finally {
      // release database resources
      try {
        conn.close();
      } catch (Exception e) {
      }
    }
  }
}