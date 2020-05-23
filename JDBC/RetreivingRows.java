import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetreivingRows {
  public static void main(String[] argv) throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String pass = "";

    Class.forName(driver).newInstance();
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3380/uttam", user, pass);

    Statement st = con.createStatement();
    ResultSet res = st.executeQuery("SELECT * FROM  users");
    while (res.next()) {
      int i = res.getInt("ID");
      String s = res.getString("username");
      System.out.println(i + "\t\t" + s);
    }
    con.close();
  }
}