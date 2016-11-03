import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{   int time;
    boolean allCaptured;
    int noOfPlanetsCaptured;
    int surplusSoldiers;
    int[] planets;
    int[] soldiers;
    
    SpaceShip s=new SpaceShip();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {     super(3000, 1000, 1);
          
          prepare();
       
    }
    SpaceShip getSpaceShip(){
        return s;
    }
    void prepare(){
     addObject(new Asteroids(),240,160);
     addObject(new HomePlanet(),150,460);
     addObject(new AlienPlanet(),660,100);
     addObject(new AlienPlanet(),660,500);
     addObject(new AlienPlanet(),1060,100);
     addObject(new AlienPlanet(),1060,500);
     addObject(new Aliens(),660, 100);
     addObject(new Aliens(),660, 500);
     addObject(new Soldier(),150,300);
     addObject(s,200,460);
    }
    void submitScores(){
    //to do
    }
    void growSoldiers(){
    //to do
    }
    void check(){
    //to do
    }    
    void mouseDragSoldiers(){
    //to do
    }
    
}
