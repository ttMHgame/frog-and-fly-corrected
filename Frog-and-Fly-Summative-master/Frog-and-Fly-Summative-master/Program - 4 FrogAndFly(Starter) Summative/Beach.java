import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
/**
 * caelan
 * software development 10s
 * mr.hardman
 * 10/22/2018
 */
public class Beach extends World
{
    public int no=10;
    private Scoreboard score;
     /**
     * this puts the food and cretures in the world
     * @param There is no parameters
     * @return There is no return types
     */
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       
       addFood(10);

       // add a Fly object at a random position somewhere in the world
       addObject(new Fly(),Greenfoot.getRandomNumber( getWidth() ) ,Greenfoot.getRandomNumber( getHeight() ));
       score = new Scoreboard();
        addObject( score, 75, 25);
       // add a Frog object at the center of the world 
       
       if(no== 0){
            addFood(10);
            no=10;
        }
    }
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
          
        }
    }
   /**
     * updates score board
     * @param There is no parameters
     * @return There is no return types
     */
    public void update()
    {
        score.addToScore();
        no=no-1;
    }
}

