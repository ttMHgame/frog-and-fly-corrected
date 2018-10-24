import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */

public class Fly extends Creature
{
    // int that counts dow how much food is left
    public int no = 10;
    /**
     * this method is used once 
     * sets the fly in a random direction
     * 
     * @param There is no parameters
     * @return There is no return types
     */
    public Fly()
    {
        /*
         * modify this code to make the turtle face any random 
         * initial direction
         */
        setRotation(Greenfoot.getRandomNumber(180));
    }
    
    
     /**
     * 
     * runs the program     
     * @param There is no parameters
     * @return There is no return types
     */
          public void act() {
     
    // make the fly move 4 steps in the direction it is facing
        
        if(Greenfoot.isKeyDown("up")){
            move(4);
        }
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        if(Greenfoot.isKeyDown("right")) {
            turn(5);
        } else if(Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
    
        
     
         
       
     
        if( isTouching( Food.class)) {
        
            
            removeTouching(Food.class);
            Greenfoot.delay(1);
            no=no-1;
            Greenfoot.delay(1);
            ((Beach)getWorld()).update();
            
            
        }
        
        if(no == 0 ) {
                ((Beach)getWorld()).addFood(10);
                no=10;
                Greenfoot.delay(1);
                no=10;
            }
        
        
    } 
}
    

    



