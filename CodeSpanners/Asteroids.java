import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Asteroids class
 */
public class Asteroids extends Actor implements AsteroidDraw
{
    /**
     * Act - do whatever the Asteroids wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = -1;
    public void act() 
    {
        setLocation(getX(), getY());
   
    }
    public Asteroids(){
  
        
    }
    
    public void draw()
    {
        //stub
    }
}
