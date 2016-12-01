import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteorite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteorite extends Asteroids
{
    /**
     * Act - do whatever the Meteorite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Meteorite()
    {
      GreenfootImage image = getImage() ;
      image.scale(20,20) ;
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
