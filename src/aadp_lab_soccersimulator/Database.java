/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rayen
 */
public class Database {

    protected static final String DB_URL = "jdbc:mysql://localhost/world_cup";
    protected static final String USER = "football";
    protected static final String PASS = "Java is almost as good as football";

    //   Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    public static void setupDatabase(String[] teams) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE SCHEMA IF NOT EXISTS world_cup;");
            stmt.execute("USE world_cup;");

            for (String team : teams) {
                String sql = "CREATE TABLE IF NOT EXISTS " + team + " ("
                        + "name VARCHAR(30) NOT NULL,"
                        + "number INT NOT NULL PRIMARY KEY,"
                        + "birth VARCHAR(30),"
                        + "position VARCHAR(30),"
                        + "goalsScored INT,"
                        + "background TEXT(1000));";
                stmt.execute(sql);
            }
            System.out.println("Tables setup completed successfully in world_cup database...");
        } catch (SQLException e) {
            System.out.println("Problem with setting up world_cup database tables:");
            e.printStackTrace();
        }
    }

}
