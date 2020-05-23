import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStat {
  public static void main(String[] argv) throws Exception {
    String driverName = "com.mysql.jdbc.Driver";
    Class.forName(driverName);

    String url = "jdbc:mysql://localhost:3380/uttam" ;
    String username = "root";
    String password = "";

    Connection connection = DriverManager.getConnection(url, username, password);
    String sql = "INSERT INTO users (ID,username,address,mobile_no) VALUES(?,?,?,?)";
    PreparedStatement pstmt = connection.prepareStatement(sql);

    // Insert 10 rows
    for (int i = 0; i < 10; i++) {
      // Set the value
      pstmt.setInt(1, 121 + i);
      pstmt.setString(2, "Ansh " + i);
      pstmt.setString(3, "Pithampur" + i);
      pstmt.setString(4, "3456655" + i);

      // Insert the row
      pstmt.executeUpdate();
    }

  }
}