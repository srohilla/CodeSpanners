import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Comet to express weight of the path between planets
 **/
public class Comets extends Asteroids
{
    /**
     * Act - do whatever the Comets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Comets()
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
      image.scale(30,30) ;
    }
}
