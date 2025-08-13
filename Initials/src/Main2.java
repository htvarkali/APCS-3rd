import kareltherobot.*;

public class Main2 implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(9,9);
    World.setDelay(1);
    Robot r = new Robot(1,5,North,100);

    for (int i = 0; i < 4; i++) {
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    }
    

    

    
	

    

    
    


  }
  
}