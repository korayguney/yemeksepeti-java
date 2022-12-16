package com.yemeksepeti.genericschallenge;

public class PlayerTest {
    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("Arda Güler");
        FootballPlayer footballPlayer2 = new FootballPlayer("Emre Mor");
        BasketballPlayer basketballPlayer = new BasketballPlayer("Vasilia Mircic");
        VolleyballPlayer volleyballPlayer = new VolleyballPlayer("Ebrar Karakurt");

        Team<FootballPlayer> fenerbahce = new Team<>("Fenerbahçe");
        fenerbahce.addPlayer(footballPlayer1);
        fenerbahce.addPlayer(footballPlayer2);
       // fenerbahce.addPlayer(basketballPlayer);
       // fenerbahce.addPlayer(volleyballPlayer);

        Team<BasketballPlayer> anadoluefes = new Team<>("Anadolu Efes");
        anadoluefes.addPlayer(basketballPlayer);
       // anadoluefes.addPlayer(footballPlayer1);
    }
}
