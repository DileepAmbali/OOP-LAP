import java.sql.*; //PROGRAM TO IMPLEMENT SQL QUERIES
import java.util.Scanner;

class dictionary {
    public static void main(String arg[]) {
        try {
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter word : ");
            String str = sc.nextLine();
            Class.forName("com.mysql.cj.jdbc.Driver"); // REGISTER DRIVER
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from dictionary");
            while (rs.next()) {
                if (rs.getString(1).equals(str)) {
                    System.out.println(rs.getString(1) + " - " + rs.getString(2));
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(str + " was not found");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}