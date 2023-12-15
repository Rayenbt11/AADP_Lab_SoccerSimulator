/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayen
 */
public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Add a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Get all players in the team
    public List<Player> getPlayers() {
        return players;
}

    public String getName() {
        return name;
    }
    
}
