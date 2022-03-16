package edu.wctc.mazeGame;

public interface Lootable
{
    public default String loot(Player player){
        String item = "canned food";
        player.addToScore(100);
        player.addToInventory(item);
        return item;
    }
}
