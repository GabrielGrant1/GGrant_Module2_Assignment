package edu.wctc.mazeGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner movement = new Scanner(System.in);
        String d;

        Maze maze = new Maze();
        maze.Player();
        maze.Maze();

        do {
            System.out.println(maze.currentRoom.getDescription());
            System.out.println(maze.currentRoom.getExits());
            System.out.println("What will you do?");
            d = movement.nextLine();
            char choice = d.charAt(0);
            switch (choice){
                case 'n':
                case 's':
                case 'e':
                case 'w':
                case 'u':
                case 'd':
                    maze.move(choice);
                    break;
                case 'i':
                    maze.interactWithCurrentRoom();
                    break;
                case 'l':
                    maze.lootCurrentRoom();
                    break;
                case 'x':
                    maze.exitCurrentRoom();
                    break;
                case 'v':
                    maze.getPlayerInventory();
                default: System.out.println("That isn't an option, try again");
            }
        } while (!maze.isFinished);
        System.out.println(maze.getPlayerScore());
    }
}

