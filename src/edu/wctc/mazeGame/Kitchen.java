package edu.wctc.mazeGame;

public class Kitchen extends Room implements Lootable{

    public Kitchen(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        return Lootable.super.loot(player);
    }

    @Override
    public String getDescription() {
        return "There is a sink, a stove, and an empty counter top in front of you with a window above it";
    }
}
