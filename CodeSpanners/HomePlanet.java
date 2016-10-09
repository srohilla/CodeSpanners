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
   
   public HomePlanet(){
        GreenfootImage image = getImage() ;
        image.scale(150,150) ;
        
    }
   
    /**
     * Act - do whatever the HomePlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
   
    int getSoldierCount()
    {
        // put your code here
        int value = 0;
        return value;
    }
}
