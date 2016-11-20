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
    Planet homeplanet;
    Planet[][] planet=new Planet[3][5];
    Marker marker=new Marker();
    SpaceShip s=new SpaceShip();
   String atPlanet="10";
   int currentX;
   int currentY;

   /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {      super(2000, 780, 1);
         planet[1][0] =new HomePlanet("10");
         planet[0][1]=new AlienPlanet("01");
         planet[2][1]=new AlienPlanet("21");
         planet[0][2]=new AlienPlanet("02");
         planet[1][2]=new AlienPlanet("12");
         planet[2][2]=new AlienPlanet("22");
         planet[0][3]=new AlienPlanet("03");
         planet[2][3]=new AlienPlanet("23");
         planet[1][4]=new AlienPlanet("14");
         addObject(planet[1][0],120,400);
     addObject(planet[0][1],340,120);
     addObject(planet[2][1],300,580);
     addObject(planet[0][2],580,180);
     addObject(planet[1][2],670,450);
     addObject(planet[2][2],550,680);
     addObject(planet[0][3],880,120);
     addObject(planet[2][3],970,580);
     addObject(planet[1][4],1400,400);
    
     //Greenfoot.playSound("background.wav"); 
     
     //addObject(new Aliens(),660, 100);
     //addObject(new Aliens(),660, 500);
     addObject(new Soldier(),120,350);
     addObject(s,150,350);
     
         
     currentX=planet[Integer.parseInt(atPlanet.substring(0,1))][Integer.parseInt(atPlanet.substring(1))].getX();
     currentY=planet[Integer.parseInt(atPlanet.substring(0,1))][Integer.parseInt(atPlanet.substring(1))].getY();
    }
    SpaceShip getSpaceShip(){
        return s;
    }
    Marker getMarker(){
        return marker;
    }
    public void setPlanet(String s){
        atPlanet=s;
    }
    void prepare()
    {
   //  addObject(new Asteroids(),240,160);
     

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
