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
    GifImage planet= new GifImage("alienPlanet1.gif");
    //Actor alien = getOneObjectAtOffset(0,0, Aliens.class);  
    /**
     * Act - do whatever the AlienPlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public AlienPlanet(){
   
    }
    public void act() 
    {
   // World world = getWorld();     
        // Add your action code here.
     setImage(planet.getCurrentImage());
     capture();
    // Greenfoot.delay(100);
    // world.removeObject(alien);
    }    
    
    public void capture()
    {
    //to do
    
    World world = getWorld(); 
    Actor alien = getOneObjectAtOffset(0,0, Aliens.class); 
    Greenfoot.delay(100);
    world.removeObject(alien);
    world.addObject(new Soldier(),660,100);
    
    }
    
    public void uncapture()
    {
        
    }
}
