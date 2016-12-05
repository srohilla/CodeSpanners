import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Parent class for Alien and Home Planet
 */
public class Planet extends Actor
{   
    public boolean isCaptured= false;
    public boolean isClickable=false;
    public int planetNumber;
    public int xLoc;
    public int yLoc;
    public HashMap<Integer,Integer> neighbourMatrix = new HashMap<Integer,Integer>();
    /**
     * Act - do whatever the Planet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        // Add your action code here.
      
    }    
    public void onPlanet()
    {
        act();
    }
    public void gotToPlanet(){
    
    }
    
    //marks the planet as captured
    public void capture(){
    
      
    
    }
    
    
}
