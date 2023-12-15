/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Sam Please put the names and student numbers of the team here:
 *
 * Name 1: Rayen Bentemessek Number 1: 2021378
 *
 * Name 2: Number 2:
 *
 * Name 3: Number 3:
 *
 * Name 4: Number 4
 *
 */
public class AADP_Lab_SoccerSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        String DB_URL = "jdbc:mysql://localhost/world_cup";
        String USER = "football";
        String PASS = "Java is almost as good as football";
        String[] teams = {"Ireland", "Brazil", "Argentina", "Japan", "Mexico", "Senegal", "Tunisia", "Qatar"};
        Database.setupDatabase(teams);

        Menu menu = new Menu(teams, DB_URL, USER, PASS);
        menu.displayMainMenu();

    }
}
