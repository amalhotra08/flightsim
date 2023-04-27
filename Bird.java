public class Bird extends Obstacle {
/**
 * This is the Bird class, a subclass of Obstacle.
 * This class inherits all of the methods from the Obstacle class, except the abstract method getImage().
 * The Bird will be the slowest of the obstacles.
 */
   int x;
   int y;
   int speed;
  
   public Bird(int x, int y, int speed) {
   // This is the constructor for the bird class, which is a subclass of the Obstacle class.
      this.x = x;
      this.y = y;
      this.speed = speed;
   }
   
   public void getImage() {
   // This method will return the image for the bird obstacle.
   // It will return an image, but for compiling purposes it is currently a void method.
   }
}