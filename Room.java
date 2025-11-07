import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Room 
{
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;
    private HashMap<String, Room> exits;
    
    
    public Room(String description){
        this.description = description;
        exits = new HashMap<String, Room>();
    }
    
    public Room getExit(String direction){
        if (direction.equals("north")){
            return northExit;
        }
        if (direction.equals("east")){
            return eastExit;
        }
        if (direction.equals("south")){
            return southExit;
        }
        if (direction.equals("west")){
            return westExit;
        }
        return null;
    }

    public String getExitString(){
        //idk what to do here
        String Exits = "Exits: ";
        
        if(northExit != null) {
            Exits += " north";
        }
        if(eastExit != null) {
            Exits += " east";
        }
        if(southExit != null) {
            Exits += " south";
        }
        if(westExit != null) {
            Exits += " west";
        }
        
        return Exits;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
}
