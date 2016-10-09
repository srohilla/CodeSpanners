import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienPlanet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienPlanet extends Actor implements Planet
{
    boolean isBlue;
    int weight[];
    int planetNumber;
    
    /**
     * Act - do whatever the AlienPlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public AlienPlanet(){
        GreenfootImage image = getImage() ;
        image.scale(150,150) ;
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void capture()
    {
    //to do
    }
    
    public void uncapture()
    {
        
    }
}
