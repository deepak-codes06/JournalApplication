//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*; //import

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "DEEPAk.06";
        String query = " UPDATE employees SET job_title = 'full stack developer', salary = 150000 WHERE id = 4 ";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load drivers
            System.out.println("Drivers loaded successfully!!!");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully!!!!");
            Statement stmt = con.createStatement();
            int rowsAffected = stmt.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Updation successfull!!! " +rowsAffected+ "row(s) affected.");
            }else{
                System.out.println("Updation failed!!");
            }

            stmt.close();
            con.close();

            System.out.println();
            System.out.println("connections closed successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}