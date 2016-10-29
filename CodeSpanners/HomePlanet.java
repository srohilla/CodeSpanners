import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePlanet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePlanet extends Actor implements Planet
{
   int noOfSoldiers;
   int weight[];
     GifImage planet= new GifImage("planet.gif");
   
   public HomePlanet()
   {
       
        
    }
   
    /**
     * Act - do whatever the HomePlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        setImage(planet.getCurrentImage());
    }    
   
    int getSoldierCount()
    {
        // put your code here
        int value = 0;
        return value;
    }
}
