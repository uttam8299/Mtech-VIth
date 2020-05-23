import java.sql.*; 
public class GetKey {
 
    public static void main(String a[]){
         
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                getConnection("jdbc:mysql://localhost:3380/uttam"
                    ,"root","");
            String query = "insert into users (id, username, address,mobile_no) values (?,?,?,?)";
            pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1,256);
            pstmt.setString(2, "Akash");
            pstmt.setString(3, "Pithampur");
            pstmt.setString(4,"2456254");
            pstmt.executeUpdate();
            rs = pstmt.getGeneratedKeys();
            if(rs != null && rs.next()){
                System.out.println("Generated Emp Id: "+rs.getInt(1));
            }
 
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
 
}