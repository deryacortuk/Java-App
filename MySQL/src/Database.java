
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    private String username ="root";
    private String password = "";
    private String db = "employees";
    private String host = "localhost";
    private int port = 3306;
    
    private Statement statement = null;
    
    
    private Connection connect = null;
    
    public Database(){
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db + "?userUnicode=true&characterEncoding=utf8";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("Driver was not found!");
        }
        try {
            connect = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful.");
        } catch (SQLException ex) {
           
           System.out.println("Connection Error!");
        }
        
    }
    public void getEmployee(){
        String inquiry = "select * from user";
        try {
            statement = connect.createStatement();
            ResultSet rs =statement.executeQuery(inquiry);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                System.out.println("Id: " + id + "\nname: " + name + "\nsurname: " + surname + "\nemail: " + email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addEmployee(){
        try {
            statement = connect.createStatement();
            String name = "Green";
            String surname = "Blue";
            String email = "app@email.com";
            String inqury = "Insert Into user (name, surname, email) VALUES (" + "'" + name + "'," + 
                  "'"  + surname + "',"  + "'"+ email + "')";
            
            statement.executeUpdate(inqury);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public  void updateEmployee(){
        try {
            statement = connect.createStatement();
            String query ="Update user  Set email = 'blue7@gmail.com' where id=2 ";
            statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void deleteEmployee(){
        try {
            statement = connect.createStatement();
            String query = "Delete from user where id>5";
            int value = statement.executeUpdate(query);
            System.out.println(value + "data deleted!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        Database database = new Database();
       
       database.addEmployee();
       database.getEmployee();
       database.updateEmployee();
       database.getEmployee();
       database.deleteEmployee();
    }
    
    
    
}
