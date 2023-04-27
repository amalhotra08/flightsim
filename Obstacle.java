public abstract class Obstacle {
/**
 * The base class for all obstacles in the game.
 * This is an abstract class because we are creating multipile different objects with the same methods.
 * Additionally, we never instantiate an obstacle alone, but by its subclasses.
 * Obstacles will spawn at random times and positions on the y-axis.
 * Once they come into contact with the player, the game will end.
 */

    public int getX() {
      // This method will get the current x coordinate of the obstacle
      return 0;
    }

    public int getY() {
    // This method will get the current y coordinate of the obstacle
      return 0;
    }
    
    public int setX() {
    // This method will set the current x coordinate of the obstacle
      return 0;
    }
    
    public int setY() {
    // This method will set the current y coordinate of the obstacle
      return 0;
    }

    public int getSpeed() {
    // This method will get the current speed of the obstacle
      return 0;
    }
    
    public int changeSpeed(int speed){
    // This method will update the speed of the obstacle depending on which obstacle is initiated or the score of the player
      return 0;
    }
    
    public int changePos() {
    // This method will update the obstacle's coordinates to move it across the screen
      return 0;
    }
    
    public abstract void getImage();
    // This method will set the image of the obstacle based on what is instantiated.
    // This is an abstract method because the image set for each of the obstacles will vary.
}
