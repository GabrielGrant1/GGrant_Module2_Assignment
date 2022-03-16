package edu.wctc.mazeGame;

public class DiningRoom extends Room implements Exitable{

    public DiningRoom(String name) {
        super(name);
    }

    @Override
    public String exit(Player player) {
        return Exitable.super.exit(player);
    }

    @Override
    public String getDescription() {
        return "You see a small square table with a single chair and an old ceiling fan above it";
    }
}
