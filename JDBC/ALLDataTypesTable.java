import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ALLDataTypesTable {
  public static Connection getConnection() throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3380/uttam";
    String username = "root";
    String password = "root";
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }

  public static void main(String[] args) throws Exception{
    PreparedStatement pstmt = null;
    Connection conn = null;
    try {
      StringBuffer sql = new StringBuffer("CREATE TABLE tableWithAllTypes(");
      sql.append("column_boolean       BOOL, ");                // boolean
      sql.append("column_byte          TINYINT, ");             // byte
      sql.append("column_short         SMALLINT, ");            // short
      sql.append("column_int           INTEGER, ");             // int
      sql.append("column_long          BIGINT, ");              // long
      sql.append("column_float         FLOAT, ");               // float
      sql.append("column_double        DOUBLE PRECISION, ");    // double
      sql.append("column_bigdecimal    DECIMAL(13,0), ");       // BigDecimal
      sql.append("column_string        VARCHAR(254), ");        // String
      sql.append("column_date          DATE, ");                // Date
      sql.append("column_time          TIME, ");                // Time
      sql.append("column_timestamp     TIMESTAMP, ");           // Timestamp
      sql.append("column_asciistream1  TINYTEXT, ");            // Clob ( 2^8 bytes)
      sql.append("column_asciistream2  TEXT, ");                // Clob ( 2^16 bytes)
      sql.append("column_asciistream3  MEDIUMTEXT, ");          // Clob (2^24 bytes)
      sql.append("column_asciistream4  LONGTEXT, ");            // Clob ( 2^32 bytes)
      sql.append("column_blob1         TINYBLOB, ");            // Blob ( 2^8 bytes)
      sql.append("column_blob2         BLOB, ");                // Blob ( 2^16 bytes)
      sql.append("column_blob3         MEDIUMBLOB, ");          // Blob ( 2^24 bytes)
      sql.append("column_blob4         LONGBLOB)");             // Blob ( 2^32 bytes)

      conn = getConnection();
      pstmt = conn.prepareStatement(sql.toString());
      pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
  }
}