package com.uditest.parcial;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Welcome to the player adding program.\n In this terminal based program, you can add players for a future game.\n");
        
        Players play = new Players();
        
        play.addPlayer();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Do you want to add more players? Y/N: ");
        var ans = sc.next().charAt(0);
        
        while (ans == 'y' || ans == 'Y') {
            play.addPlayer();
            
            System.out.println("Do you want to add more players? Y/N: ");
            ans = sc.next().charAt(0);
        }
        
        if (ans == 'n' || ans == 'N') {
            System.out.println("These are the players you added:\n" + play.players);
        }
    }
}
