package edu.wctc.mazeGame;

abstract class Room
{
    private String name;

    public Room(String name){
        this.name = name;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction){
       if(validDirection(direction)){
           switch (direction) {
               case 'd':
               case 's':
                   return south;
               case 'n':
               case 'u':
                   return north;
               case 'e':
                   return east;
               case 'w':
                   return west;
               default:
                   return null;
           }
       }
        return null;
    }

    public String getExits(){
        //TODO: add string of exit code
        return null;
    }

    public String getName(){
        return name;
    }

    public boolean validDirection(char direction){
        //TODO: check if room is in a valid direction
        if(true){
            return true;
        }
        return false;
    }

    public Room north;

    public Room south;

    public Room east;

    public Room west;

    public Room down;

    public Room up;

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public void setUp(Room up) {
        this.up = up;
    }
}
