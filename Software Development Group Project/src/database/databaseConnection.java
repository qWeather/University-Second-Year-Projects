/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import frames.adminPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @authors Beatrice Antoniu - w1688177, Turgay Ozgun - w1713054, Zehra Mahmood - w1681624
 */
public class databaseConnection {
            
    //Main connection of database
    public static Connection connection = null;

    //Method for retrieving connection to the database
    public static Connection getConnection() throws ClassNotFoundException {
        try {
            System.out.println("CONNECTING");
            Class.forName("org.sqlite.JDBC"); //accessing jar file
            connection = DriverManager.getConnection("jdbc:sqlite:SoftwareDB.db"); //connecting to the database through the database url
            System.out.println("CONNECTION SUCCESSFUL");
        } catch (SQLException e) {
            System.out.println("ERROR: Connection Failed!"); //display if the datbase is not found
        }
        return connection;
    }

    //Method to insert login details from the login.java to the database table login
    public static void login(String username, String password, String login) throws ClassNotFoundException, SQLException {
        PreparedStatement ps;
        try {
            System.out.println("INSERTING");
            String sql = "INSERT INTO login (username, password, login) VALUES ('" + username + "', '" + password + "', '" + login + "')"; //query for locating and inserting data into columns
            ps = getConnection().prepareStatement(sql);
            ps.executeUpdate(); //updating the statement
            ps.close(); //closing statement
            getConnection().close(); //closing connection to the database
            System.out.println("INSERT SUCCESSFUL");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void register(String fname, String surname, String email, String role, String password, String gender, String date) throws ClassNotFoundException {
        PreparedStatement ps;
        try {
            System.out.println("INSERTING");
            String sql = "INSERT INTO register (fname, surname, email, role, password, gender, date)"
                    + " VALUES ('" + fname + "', '" + surname + "', '" + email + "', '" + role + "', '" + password + "', '" + gender + "' , '" + date + "')";
            ps = getConnection().prepareStatement(sql);
            ps.executeUpdate(); //updating the statement
            ps.close(); //closing statement
            getConnection().close(); //closing connection to the database
            System.out.println("INSERT SUCCESSFUL");
        } catch (SQLException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static ResultSet getUsers() throws SQLException, ClassNotFoundException {
        ResultSet rs;
        try (Statement s = getConnection().createStatement()) {
            rs = s.executeQuery("SELECT count(email) FROM register" ); //counts the number of rows in the specified column
            if (rs.next()) {
                String noUsers = rs.getString("count(email)");
                adminPanel.users.setText(noUsers);
            }
            s.close(); //closing statement
            getConnection().close(); //closing connection to the database
        }
        return rs;
    }
 
    public static ArrayList findProjects() throws ClassNotFoundException {
        Statement stmt;

        ArrayList<String> listedProject = new ArrayList<>();
        try {
            stmt = getConnection().createStatement();
            String sql = "SELECT DISTINCT projectacronym FROM dataset;"; //query for locating and selecting the data from the dataset
            stmt.execute(sql);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                String project = rs.getString(1);
                listedProject.add(project);
            }
            stmt.close(); //closing statement
            getConnection().close(); //closing connection to the database
            return listedProject;
        } catch (SQLException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            return null;
        }
    }

    public static int findParticipants(String project) throws ClassNotFoundException {
        Statement stmt;
        int temp = 0;
        try {
            stmt = getConnection().createStatement();
            String sql = "SELECT DISTINCT name FROM dataset WHERE projectacronym = '" + project + "'"; //query for locating and selecting the data from the dataset by a certain column
            stmt.execute(sql); 
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                temp += 1;
            }
            stmt.close(); //closing statement
            getConnection().close(); //closing connection to the database
            return temp;
        } catch (SQLException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            return 0;
        }
    }
   
    public static ResultSet getCountries(String query) throws SQLException, ClassNotFoundException {
        ResultSet rs;
        try (PreparedStatement ps = getConnection().prepareStatement(query)) {
            rs = ps.executeQuery();
             getConnection().close(); //closing connection to the database
        }
        return rs;
    }
}
