import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Meteorite to express weight of the path between planets
 **/
public class Meteorite extends Asteroids
{
    /**
     * Act - do whatever the Meteorite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Meteorite()
    {
 
      draw();
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void draw()
    {
         GreenfootImage image = getImage() ;
         image.scale(20,20) ;
    }
}
