/**
 * Captured State of Alien planet
 * 
 * @Seema Rohilla 
 */
import java.util.*;

public class CapturedState implements PlanetState 
{
   AlienPlanet planet;

    /**
     * Constructor for objects of class CapturedState
     */
    public CapturedState(AlienPlanet planet)
    {
        this.planet=planet;
    }
   public void capture(GameWorld g){
         Set<Integer> keys=planet.neighbourMatrix.keySet();

          g.selectedPlanetId=planet.planetNumber;
     
             g.isSourceSelected=true;
             for(Integer k:keys){
             g.activateNeighbourAlien(k);
            }   
    }



}
