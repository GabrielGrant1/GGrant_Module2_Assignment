package edu.wctc.mazeGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public int score = 0;

    List<String> inventory = new ArrayList<>();

    public void addToInventory (String item) {
        inventory.add(item);
    }

    public void addToScore (int points) {
        score += points;
    }


    public String getInventory() {
        String inv = null;
        if (inventory.isEmpty() == true){
            String empty = "You have nothing.";
            inv = empty;
        }else{
            for(String items : inventory){
                inv = items;
            }
        }
        return inv;
    }

    public int getScore() {
        return score;
    }
}
