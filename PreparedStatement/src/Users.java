import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Users {
    private String username = "root";
    private String password = "";
    private String database = "employees";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    public void preparedGetUser(int id){
        String query = "Select * from user where id =?";
        try {
           preparedStatement =(PreparedStatement) con.prepareStatement(query);
           preparedStatement.setInt(1, id);
           ResultSet rs = preparedStatement.executeQuery();
           while(rs.next()){
               String name = rs.getString("name");
               String surname = rs.getString("surname");
               String email = rs.getString("email");
               System.out.println("name: " + name + "surname: " + surname + "\nemail: " +email);
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public  Users(){
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?userUnicode=true&characterEncoding=utf8";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver was not found!");
        }
        try {
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful.");
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        } 

    
    
}
    
    public void commitRollback(){
        Scanner scanner = new Scanner(System.in);
        try {
            con.setAutoCommit(false);
            String query1 = "delete from user where id=2";
            String query2 = "update user set email= 'derya@gmail.com' where id=1";
            System.out.println("Before");
            getUsers();
            Statement statement =con.createStatement();
            statement.executeUpdate(query1);
            statement.executeUpdate(query2);
            System.out.println("Save your transactions??? (yes/no");
            
            String answer =  scanner.nextLine();
            if(answer.equals("yes")){
            con.commit();
            getUsers();
                System.out.println("Database was updated.");
            
            
            
            
        }else{
                con.rollback();
                System.out.println("Database was canceled.");
                getUsers();
                
            }
        }
        
            catch (SQLException ex) {
            
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public  void getUsers(){
        String query = "select * from user";
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                System.out.println("name: " +name+ "surname: " + surname + "email: " + email);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        Users user = new Users();
        user.preparedGetUser(5);
        user.commitRollback();
        
    }
    
    
    
    
}
