import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo2 {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3380/uttam", "root", "");

    Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

    // Move to the second row
    resultSet.absolute(2);
    System.out.println("You are now in: " + resultSet.getRow());

    // Move 2 records forward from the current position (fourth row)
    resultSet.relative(2);
    System.out.println("You are now in: " + resultSet.getRow());

    // Move to the last row in the result set
    resultSet.absolute(-1);
    System.out.println("You are now in: " + resultSet.getRow());

    // Move 3 records backward from the current position (second row)
    resultSet.relative(-3);
    System.out.println("You are now in: " + resultSet.getRow());
    connection.close();
  }
}