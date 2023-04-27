public class Missile extends Obstacle {
/**
 * This is the Missile class, a subclass of Obstacle.
 * This class inherits all of the methods from the Obstacle class, except the abstract method getImage().
 * The Missile will be the fastest of the obstacles.
 */
   int x;
   int y;
   int speed;
  
   public Missile(int x, int y, int speed) {
   // This is the constructor for the missile class, which is a subclass of the Obstacle class.
      this.x = x;
      this.y = y;
      this.speed = speed;
   }
   
   public void getImage() {
   // This method will return the image for the missile obstacle.
   // It will return an image, but for compiling purposes it is currently a void method.
   }
}