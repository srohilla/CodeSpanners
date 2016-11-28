import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.IOException;
/**
 * Write a description of class AllPlanetCaptured here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AllPlanetCaptured extends Actor
{
    /**
     * Act - do whatever the AllPlanetCaptured wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
  // Add your action code here.
    } 
    public AllPlanetCaptured(){
    GreenfootImage image = getImage();
        image.scale(800,600) ;
    }
    
    public void postRanking(){
       try{
        Score score=new Score();
        score.postScores();
        
    }
    catch(IOException ex){
    
    }
    }
}
