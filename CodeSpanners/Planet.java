import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planet extends Actor
{   //status of planet
   // String Status="NotCaptured";
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
    
        //Status="Captured";
    
    }
    
    
}
