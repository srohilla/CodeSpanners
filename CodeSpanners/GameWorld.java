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
    Planet[][] planet=new Planet[3][4];
    Marker marker=new Marker();
    SpaceShip s=new SpaceShip();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {     super(3000, 1000, 1);
          planet[1][0]=new HomePlanet();
          planet[0][1]=new AlienPlanet();
          planet[0][2]=new AlienPlanet();
          planet[1][1]=new AlienPlanet();
          planet[1][2]=new AlienPlanet();
          prepare();
       
    }
    SpaceShip getSpaceShip(){
        return s;
    }
    Marker getMarker(){
        return marker;
    }
    void prepare(){
     addObject(new Asteroids(),240,160);
     addObject(planet[1][0],150,460);
     addObject(planet[0][1],660,100);
     addObject(planet[0][2],1060,100);
     addObject(planet[1][1],660,500);
     addObject(planet[1][2],1060,500);
     
     
     addObject(new Aliens(),660, 100);
     addObject(new Aliens(),660, 500);
     addObject(new Soldier(),150,300);
     addObject(s,200,460);
     planet[1][0].onPlanet();
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
