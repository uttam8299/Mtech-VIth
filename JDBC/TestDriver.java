public class TestDriver {

  public static void main(String[] args) {
    System.out.println("TestJDBCDriverInstallation_MySQL begin");
    try {
      String className = "com.mysql.jdbc.Driver";
      Class driverObject = Class.forName(className);
      System.out.println("driverObject=" + driverObject);
      System.out.println("your installation of JDBC Driver OK.");
    } catch (Exception e) {
      // your installation of JDBC Driver Failed
      System.out.println("Failed: JDBC Driver Error: " + e.getMessage());
    }

    System.out.println("TestJDBCDriverInstallation_MySQL end");
  }

}
