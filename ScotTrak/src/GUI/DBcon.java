package GUI;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import scottrak.Classes.Config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric
 */
public class DBcon {
    
    /*
    * This class helps with making the programmer not have to retype the location of the database each time the database needs called.
    * This also allows for the database location, user login, and user password to only have to be changed in one place instead of 
    * each instance when the database has to be called.
    */
    
    private DBaction dba;
    
    public DBcon(){
    
    }
    
    public void View(String sql, DBaction d){
    
    
        this.dba = d;
        
        //Pulling Campaigns
        try {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            } catch (ClassNotFoundException ex) { 
                Logger.getLogger(Filter.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con;
            con = DriverManager.getConnection(
                    DBcon.Connect(),
                    DBcon.Login(), DBcon.Pass()); //(file path, db login, db password) - since it doesnt have a login, leave it blank
          
            Statement s = con.createStatement();  
            System.out.println("Connection to DB established...");
            
            ResultSet rs = s.executeQuery(sql); 
            
            
            System.out.println("Is connection closed: " + con.isClosed());
            System.out.println("Connection to DB established...");
            
            while(rs.next()){
                this.dba.DBactRS(rs);
            }
            
            con.close();
            System.out.println("Is connection closed: " + con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(Filter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Filter.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public void Insert(){
        
    }
    
    public void Update(){
        
    }
    
    public void Delete(){
        
    }
    
    public static String Connect() throws IOException{
        
        String driver = "jdbc:ucanaccess://";
        
        String USERHOME = System.getProperty("user.home");
        String USERDIR = System.getProperty("user.dir");
        String Path = driver + USERDIR + "\\Project-Edgar-Database.accdb";
        String MainPath = driver + USERDIR + "\\WAC_ScotTrak_Database.accdb";
        String ConfigPath = driver + Config.getProperty("CurrentDatabasePath");
        
        //return "jdbc:ucanaccess://" + USERDIR + "\\WAC_ScotTrak_Database.accdb";
        System.out.println(ConfigPath);
        return ConfigPath; 
        
        //(file path, db login, db password) - since it doesnt have a login, leave it blank
    }
    
    public static String Login(){
    
        //type Database login in the return statement
        return ""; //(file path, db login, db password) - since it doesnt have a login, leave it blank
    
    }
    
    public static String Pass(){ 
        
        //type Database login in the return statement
        return ""; //(file path, db login, db password) - since it doesnt have a login, leave it blank
        
    }
    
}
