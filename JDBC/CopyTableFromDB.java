import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CopyTableFromDB {
  public static void main(String[] argv) throws Exception {
    String url = "jdbc:mysql://localhost:3380/";
    String dbName = "student";
    String userName = "root";
    String password = "";

    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection conn = DriverManager.getConnection(url + dbName, userName, password);
    Statement st = conn.createStatement();
    int rows = st.executeUpdate("INSERT INTO records SELECT * FROM uttam.users");
    if (rows == 0) {
      System.out.println("Don't add any row!");
    } else {
      System.out.println(rows + " row(s)affected.");
      conn.close();
    }
  }
}