import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{   //int time;
    boolean allCaptured=false;
    int score=0;
    int noOfPlanetsCaptured=0;
    Planet home,a1,a2,a3,a4,a5,a6,a7,a8;
    HashMap<Integer,Planet> universeMatrix = new HashMap<Integer,Planet>();
    int maxFuel=25;
    int selectedPlanetId=0;
    boolean isSourceSelected=true;
    Message currentScore= new Message();
    SpaceShip spaceship=new SpaceShip();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GameWorld()
    {    
        super(1500, 750, 1);
      
         HashMap<Integer,Integer> planetmap = buildMatrix(new int[]{1,2},new int[]{2,4});
          home=new HomePlanet(0,planetmap,340,120);
         planetmap = buildMatrix(new int[]{0,2,3,5},new int[]{2,3,4,1});
          a1=new AlienPlanet(1,planetmap,340,120);
       
         planetmap=buildMatrix(new int[]{0,1,3,4},new int[]{4,3,5,3});
          a2=new AlienPlanet(2,planetmap,300,560);
        
         planetmap = buildMatrix(new int[]{1,2,5,4},new int[]{4,5,2,2});
          a3=new AlienPlanet(3,planetmap,580,300);
         
         planetmap = buildMatrix(new int[]{2,3,5,6,8},new int[]{3,2,2,3,7});
          a4=new AlienPlanet(4,planetmap,660,620);
         
         planetmap = buildMatrix(new int[]{1,3,4,7},new int[]{1,2,2,7});
          a5=new AlienPlanet(5,planetmap,750,150);
         
         planetmap = buildMatrix(new int[]{4,7,8},new int[]{3,2,3});
          a6=new AlienPlanet(6,planetmap,900,390);
         
         planetmap = buildMatrix(new int[]{5,6,8},new int[]{7,2,4});
          a7=new AlienPlanet(7,planetmap,1100,170);
          
         planetmap = buildMatrix(new int[]{7,6,4},new int[]{4,3,7});
          a8=new AlienPlanet(8,planetmap,1200,650);
           
         universeMatrix.put(1,a1);
         universeMatrix.put(2,a2);
         universeMatrix.put(3,a3);
         universeMatrix.put(4,a4);
         universeMatrix.put(5,a5);
         universeMatrix.put(6,a6);
         universeMatrix.put(7,a7);
         universeMatrix.put(8,a8);    
         prepare();
       
    }
   
   //building neighbour matrix
    HashMap<Integer,Integer> buildMatrix(int a[] , int b[])
    {
         HashMap<Integer,Integer> planetMatrix = new HashMap<Integer,Integer>();
         for(int i=0;i<a.length;i++)
         { 
             planetMatrix.put(new Integer(a[i]),new Integer(b[i])); 
         }
    
         return planetMatrix;
    }
    
    void prepare()
    {
     // addObject(r,240,160);
        //adding asteroid
        
     addObject(new Asteroids(),240,160);
     addObject(new Asteroids(),250,170);
     addObject(new Asteroids(),230,180);
     addObject(new Asteroids(),240,160);
     addObject(new Asteroids(),250,170);
     addObject(new Asteroids(),230,180);
  
     addObject(home,120,400);
     addObject(spaceship,120,350);        
      
     addObject(a1,340,120);
     addObject(a2,300,560);
     addObject(a3,580,300);
     addObject(a4,660,620);
     addObject(a5,750,150);
     addObject(a6,900,390);
     addObject(a7,1100,170);
     addObject(a8,1200,650);
  
    // addObject(m,670,450);
     Greenfoot.playSound("background.wav"); 

     addObject(currentScore,300,20);
     currentScore.setText(String.valueOf(maxFuel));


    }
    void submitScores(){
    //to do
    }
    void growSoldiers(){
    //to do
    }
    void activateNeighbour(int key){
        if (key==0){
        return;
        }
        AlienPlanet p=(AlienPlanet)universeMatrix.get(key);
        if(!p.isCaptured){  
         p.isClickable=true;
       //  p.alienGrow();
    }
    }    
    public void updatePlanetCount(){
        noOfPlanetsCaptured++;
    }
  public void updateScore(int wieght){  
      score=score+wieght;
      maxFuel=maxFuel-wieght;
      String newscore=String.valueOf(maxFuel);
      currentScore.setText(""+newscore);
    }
  public boolean checkAllCaptured(){
      if(noOfPlanetsCaptured==8){
        allCaptured=true;
        }
    return allCaptured;
    }  
    
    public int getMaxFuel(){
    return maxFuel;
    }
}
