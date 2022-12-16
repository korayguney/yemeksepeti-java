package com.yemeksepeti.genericschallenge;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already exist in the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is added to the team: " + this.getName());
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
