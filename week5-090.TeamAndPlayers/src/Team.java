/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danya
 */
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> members;
    private int maxsize;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<Player>();
        this.maxsize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player person) {
        if (this.members.size() < this.maxsize) {
            members.add(person);
        }
    }

    public void printPlayers() {
        for (Player player : members) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxsize = maxSize;
    }

    public int size() {
        return this.members.size();
    }

    public int goals() {
        int goals = 0;
        for (Player person : members) {
            goals += person.goals();
        }
        return goals;
    }
}
