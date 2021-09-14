package com.uditest.parcial;

import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    ArrayList<String> players = new ArrayList<>();
    
    protected void addPlayer() {
        var sc = new Scanner(System.in);
        
        System.out.println("Type the name of a player you want to add: ");
        String player = sc.nextLine();
        
        players.add(player);
    }
}
