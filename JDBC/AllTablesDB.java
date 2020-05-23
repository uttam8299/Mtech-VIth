import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class AllTablesDB {

  public static void main(String args[]) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    String URL = "jdbc:mysql://localhost:3380/uttam";
    Connection conn = DriverManager.getConnection(URL, "root", "");

    DatabaseMetaData dmd = conn.getMetaData();
    ResultSet rs1 = dmd.getSchemas();
    while (rs1.next()) {
      String ss = rs1.getString(1);
      ResultSet rs2 = dmd.getTables(null, ss, "%", null);
      while (rs2.next())
        System.out.println(rs2.getString(3) + " " + rs2.getString(4));
    }
    conn.close();
  }
}
