import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.IOException;
import java.util.HashMap;
/**
 * Write a description of class WinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     * 
     */
    public WinWorld()
    {    
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Greenfoot.playSound("GameWin.wav");
        AllPlanetCaptured allPlanetCaptured=new AllPlanetCaptured();
        allPlanetCaptured.postRanking();
        addObject(allPlanetCaptured,400, 300);
       
         
    }
    public void act(){
        
     
      if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new RankingWorld());
        }
    
    }
}
