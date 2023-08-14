
package pos.layerd.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "Xhq8nc3mcj");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DBConnection getInstance(){
        if (dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    
}
