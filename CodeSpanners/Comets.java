import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Comets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comets extends Asteroids
{
    /**
     * Act - do whatever the Comets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Comets()
    {
     GreenfootImage image = getImage() ;
      image.scale(30,30) ;
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
