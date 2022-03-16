package edu.wctc.mazeGame;

public class Maze {
    Room currentRoom;

    Player player;

    boolean isFinished = false;

    public void Player(){
        //TODO: check this
        Player player =  new Player();
    }

    public void Maze(){
        //TODO: fix constructor for rooms
        Room north = new Kitchen("kitchen");

        Room south = new LivingRoom("livingRoom");

        Room east = new DiningRoom("dining room");

        currentRoom = north;
    }

    public String exitCurrentRoom(){
        //TODO: implement Exitable
        String action = "This room does not have the exit";
        if(true){
            //action = exit();
            //isFinished = true;
        }
        return action;
    }

    public String interactWithCurrentRoom(){
        String action = "This room is empty";
        //TODO: determine if intractable
        if (true){
            action = interactWithCurrentRoom();
        }
        return action;
    }

    public String lootCurrentRoom(){
        //TODO: figure out how to call loot on room, figure out how to determine if the room is lootable
        String action = "This room has no loot";
        if (true){
            //action = currentRoom.loot();
        }
        return action;
    }

   public Boolean move(char direction){
        if(currentRoom.validDirection(direction)){
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
   }

   public int getPlayerScore(){
        return player.getScore();
   }

   public String getPlayerInventory(){
        return player.getInventory();
   }

   public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
   }

   public String getCurrentRoomExits(){
        return currentRoom.getExits();
   }
}
