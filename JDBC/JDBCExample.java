
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

   static final String DB_URL =
      "jdbc:mysql://localhost:3380/uttam";
   static final String DB_DRV =
      "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";

   public static void main(String[] args){

      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=DriverManager.getConnection
            (DB_URL,DB_USER,DB_PASSWD);
         statement=connection.createStatement();
         resultSet=statement.executeQuery
            ("SELECT * FROM user");
         while(resultSet.next()){
            System.out.printf("%s\t%s\t%s\t%f\n",
            resultSet.getString(1),
            resultSet.getString(2),
            resultSet.getString(3),
            resultSet.getFloat(4));
         }

      }catch(SQLException ex){
      }finally{
         try {
            resultSet.close();
            statement.close();
            connection.close();
         } catch (SQLException ex) {
         }
      }
   }
}
