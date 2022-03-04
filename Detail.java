import java.sql.*;
import java.util.Scanner;
class Detail{
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        Scanner sc = new Scanner(System.in);
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CSB","mec","mec");
        // Statement stmt = con.createStatement();
        System.out.print("What word to search for: ");
        String s = sc.nextLine();
        // ResultSet rs = stmt.executeQuery("select * from dictionary where word = "+'\"'+s+'\"');
        PreparedStatement pstmt = con.prepareStatement("select * from dictionary where word = ?");
        pstmt.setString(1, s);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        System.out.println(rs.getString("word")+" : "+rs.getString("meaning"));
        con.close();
    }
}