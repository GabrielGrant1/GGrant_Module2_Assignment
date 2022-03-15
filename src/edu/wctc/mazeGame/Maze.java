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
        Room north = new Room ("kitchen") {
            @Override
            public String getDescription() {
                return "There is a sink, a stove, and an empty counter top in front of you with a window above it";
            }
        };

        Room south = new Room("livingRoom") {
            @Override
            public String getDescription() {
                return "There is chair in the left corner in front of you, and a single light-bulb on a string above you";
            }
        };

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
        String action = "This room has no loot";
        //TODO: determine if lootable
        if (true){
            action = lootCurrentRoom();
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
