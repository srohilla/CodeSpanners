import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroids here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroids extends Actor implements DestroyableObjects, AsteroidDraw
{
    /**
     * Act - do whatever the Asteroids wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = -1;
    public void act() 
    {
        setLocation(getX(), getY());
    /*    counter = (counter +1) % 10;
        if(counter < 5)
        {
            setLocation(getX(), getY() + 5);
        }
        else
        {
            setLocation(getX(), getY() - 5);
        }
        */
    }
    public Asteroids(){
       // GreenfootImage image = getImage() ;
        //image.scale(30,30) ;
        
    }
    public void explode()
    {
        
    }
    public void draw()
    {
    }
}
