import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListTablesDB {
  public static void main(String[] args) throws Exception {
    Class.forName ("com.mysql.jdbc.Driver");

    // Enable logging
    // DriverManager.setLogStream(System.err);

    System.out.println("Getting Connection");
    Connection c = DriverManager.getConnection (
      "jdbc:mysql://localhost:3380/uttam",
      "root", "");  // user, passwd
    DatabaseMetaData md = c.getMetaData();
    ResultSet rs = md.getTables(null, null, "%", null);
    while (rs.next()) {
      System.out.println(rs.getString(3));
    }
  }
}