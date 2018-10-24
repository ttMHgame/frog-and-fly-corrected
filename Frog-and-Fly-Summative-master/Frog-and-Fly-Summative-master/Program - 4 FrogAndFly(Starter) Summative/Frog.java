import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    /**
     * sets frog speed
     * @param There is no parameters
     * @return There is no return types
     */
    public Frog()
    {
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(4)+4;
    }
    /**
     * lets frog act
     * @param There is no parameters
     * @return There is no return types
     */
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        move(speed);
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ 
         int oc;
         int lr;
         oc=Greenfoot.getRandomNumber(101);
         lr=Greenfoot.getRandomNumber(101);
         if(oc <= 36) {
             
        if(lr<=50) {
            turn(15);
        } else {
            turn(-15);
        }
    } else {
        move(speed);
    }
        
        
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        
        if(atEdgeOfWorld() == true) {
            turn(7);
        }
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
     if( isTouching(Fly.class) == true)
        {
               removeTouching(Fly.class);
            Greenfoot.stop();
         
        }
}
}
