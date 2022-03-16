package edu.wctc.mazeGame;

public class LivingRoom extends Room implements Interactable{

    public LivingRoom(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        return Interactable.super.interact(player);
    }

    @Override
    public String getDescription() {
        return "There is chair in the left corner in front of you, and a single light-bulb on a string above you";
    }
}
