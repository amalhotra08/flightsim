public class Plane extends Obstacle {
/**
 * This is the Plane class, a subclass of Obstacle.
 * This class inherits all of the methods from the Obstacle class, except the abstract method getImage().
 * The Plane will have a medium speed.
 */
   int x;
   int y;
   int speed;
  
   public Plane(int x, int y, int speed) {
   // This is the constructor for the plane class, which is a subclass of the Obstacle class.
      this.x = x;
      this.y = y;
      this.speed = speed;
   }
   
   public void getImage() {
   // This method will return the image for the plane obstacle.
   // It will return an image, but for compiling purposes it is currently a void method.
   }
}