import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataTypes {
  public static void main(String[] argv) throws Exception {
    String user = "root";
    String pass = "";

    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3380/uttam", user, pass);
    Statement st = con.createStatement();
    String table = "CREATE TABLE java_DataTypes2(typ_boolean BOOL, "
        + "typ_byte          TINYINT, typ_short         SMALLINT, "
        + "typ_int           INTEGER, typ_long          BIGINT, "
        + "typ_float         FLOAT,   typ_double        DOUBLE PRECISION, "
        + "typ_bigdecimal    DECIMAL(13,0), typ_string        VARCHAR(254), "
        + "typ_date          DATE,    typ_time          TIME, " + "typ_timestamp     TIMESTAMP, "
        + "typ_asciistream   TEXT,    typ_binarystream  LONGBLOB, " + "typ_blob          BLOB)";

    st.executeUpdate(table);
    con.close();
  }
}