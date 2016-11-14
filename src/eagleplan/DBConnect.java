package eagleplan;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {

//* based on https://www.youtube.com/watch?v=BCqW5XwtJxY
//* Used: mysql-connector-java-5.1.40-bin
    
    public Connection con;
    public Statement st;
    public  ResultSet rs;
    String sqlServerIP = "62.210.74.33";
    String sqlServerPort = "3306";
    String sqlUsername = "reefwarrior";
    String sqlPassword = "1gDemeroll!(@*";
    String sqlDatabaseName = "training";
    //String sqlQuery = "Select * from training";

    public void DBConnect() throws Exception {
        try {
            String conString = "jdbc:mysql://" + sqlServerIP + ":" + sqlServerPort + "/" + sqlDatabaseName;
            System.out.println("Success!");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(conString, sqlUsername, sqlPassword);
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null,"Eagleplan Exception Error - DBConnect(): " + ex);
        }

    }

    public ResultSet GetRS(String sqlQuery) throws SQLException  {
        try {
            DBConnect();
            //ResultSet rs = null;
            //String query = sqlQuery;
            rs = st.executeQuery(sqlQuery);
            rs.first();
            //System.out.println(rs.getString("short_name"));
            
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Eagleplan Exception Error - GetRS(): " + e);
        }
    return null;
    }

    

}
