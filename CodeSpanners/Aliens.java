import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aliens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aliens extends Actor 
{
    /**
     * Act - do whatever the Aliens wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
   
     public void react(){
        
        
     setLocation(getX(), getY()+10);
      Greenfoot.delay(10);
     setLocation(getX(),getY()-10);
 
      
        
    }
    public Aliens(){
        GreenfootImage image = getImage() ;
        image.scale(70,60) ;
  
        
    }
}
