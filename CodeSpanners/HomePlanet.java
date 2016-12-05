import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 *Holds the logic for Home Planet
 */
public class HomePlanet extends Planet
{
    GifImage planet= new GifImage("planet.gif");
    
    public HomePlanet()
    {
   
    }
    public HomePlanet(int planetNumber,HashMap<Integer,Integer> adjMatrix,int xLoc,int yLoc){
     super();
        this.xLoc=xLoc;
        this.yLoc=yLoc;
        this.planetNumber=planetNumber;
        this.neighbourMatrix=adjMatrix;
        this.isClickable=true;
        this.isCaptured=true;
    
    }
    /**
     * Act - do whatever the HomePlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        
        capture();
        setImage(planet.getCurrentImage());
    } 
    
    public void capture()
    { GameWorld g=(GameWorld) getWorld();
         Set<Integer> keys=neighbourMatrix.keySet();
          
              if(Greenfoot.mouseClicked(this))
         {   
             
           
             g.selectedPlanetId=planetNumber;
             g.isSourceSelected=true;
             for(Integer k:keys){
             g.activateNeighbourAlien(k);
            } 
            
           
            
         }
            
           
            for(Integer k:keys){
             g.activateNeighbour(k);
       
    }
    
 
    
    }
   
}
