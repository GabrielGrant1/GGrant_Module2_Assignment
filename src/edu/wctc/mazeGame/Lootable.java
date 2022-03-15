package edu.wctc.mazeGame;

public interface Lootable
{
    public default String loot(Player player){
        //TODO: find a method that contains room lootables
        return null;
    }
}
