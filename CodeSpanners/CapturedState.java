/**
 * Write a description of class CapturedState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        //  planet.setState();
             g.isSourceSelected=true;
             for(Integer k:keys){
             g.activateNeighbourAlien(k);
            }   
    }



}
