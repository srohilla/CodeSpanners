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

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {     super(3000, 1000, 1);
      
          prepare();
       
    }
    void prepare(){
     addObject(new Asteroids(),30,60);
     addObject(new HomePlanet(),100,460);
     addObject(new AlienPlanet(),660,100);
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
