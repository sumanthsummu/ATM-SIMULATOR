package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("org.sqlite.JDBC");  
            c = DriverManager.getConnection("jdbc:sqlite:atm_database.db");    
            s = c.createStatement(); 
            
            // Create tables if they don't exist
            createTables();
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }
    
    private void createTables() {
        try {
            // Create login table
            s.executeUpdate("CREATE TABLE IF NOT EXISTS login (" +
                "formno TEXT PRIMARY KEY, " +
                "cardnumber TEXT, " +
                "pin TEXT)");
            
            // Create signup table
            s.executeUpdate("CREATE TABLE IF NOT EXISTS signup (" +
                "formno TEXT PRIMARY KEY, " +
                "name TEXT, " +
                "fname TEXT, " +
                "dob TEXT, " +
                "gender TEXT, " +
                "email TEXT, " +
                "marital TEXT, " +
                "address TEXT, " +
                "city TEXT, " +
                "state TEXT, " +
                "pincode TEXT)");
            
            // Create signup2 table
            s.executeUpdate("CREATE TABLE IF NOT EXISTS signup2 (" +
                "formno TEXT PRIMARY KEY, " +
                "religion TEXT, " +
                "category TEXT, " +
                "income TEXT, " +
                "education TEXT, " +
                "occupation TEXT, " +
                "pan TEXT, " +
                "aadhar TEXT, " +
                "seniorcitizen TEXT, " +
                "existingaccount TEXT)");
            
            // Create signup3 table
            s.executeUpdate("CREATE TABLE IF NOT EXISTS signup3 (" +
                "formno TEXT PRIMARY KEY, " +
                "accountType TEXT, " +
                "cardnumber TEXT, " +
                "pin TEXT, " +
                "facility TEXT)");
            
            // Create bank table for transactions
            s.executeUpdate("CREATE TABLE IF NOT EXISTS bank (" +
                "pin TEXT, " +
                "date TEXT, " +
                "type TEXT, " +
                "amount TEXT)");
                
        } catch (Exception e) {
            System.out.println("Error creating tables: " + e);
        }
    }
}