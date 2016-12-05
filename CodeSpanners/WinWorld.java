import greenfoot.*; 
import java.io.IOException;
import java.util.HashMap;
/**
 * WinWorld class holds the basic logic and rendering of the winning scenario of the game
 * 
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     * 
     */
    public WinWorld()
    {    
       
   
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
