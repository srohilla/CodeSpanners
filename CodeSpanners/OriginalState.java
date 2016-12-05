/**
 * Orginal State of Alien Planet 
 * 
 * @Seema Rohilla 
 */
import java.util.*;
import greenfoot.*;
public class OriginalState implements PlanetState
{
   AlienPlanet planet;
   
    /**
     * Constructor for objects of class OriginalState
     */
    public OriginalState(AlienPlanet planet)
    {
        this.planet=planet;
    }
    
     public void capture(GameWorld g){
         if(g.isSourceSelected){
         if((planet.neighbourMatrix.containsKey(g.selectedPlanetId))){
           
           Greenfoot.playSound("explosion.wav"); 

               Set<Integer> keys=planet.neighbourMatrix.keySet();
             
             g.removeObject(planet.alien);
             g.addObject(planet.s,planet.xLoc,planet.yLoc-40);
             g.updatePlanetCount();
             
             int wieght=planet.neighbourMatrix.get(g.selectedPlanetId);
             g.updateScore(wieght);
             g.isSourceSelected=false;
         
            for(Integer k:keys){
             g.activateNeighbour(k);
            
            }
            planet.isCaptured();
            planet.setState(planet.getCapturedState());
             
        }
        
    }
    else{
       
        planet.displayMessage();
        
        
}

    
}}
