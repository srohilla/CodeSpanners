import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World implements Subject
{   //int time;
    boolean allCaptured=false;
    int score=0;
    int noOfPlanetsCaptured=0;
    Planet home,a1,a2,a3,a4,a5,a6,a7,a8;
    HashMap<Integer,Planet> universeMatrix = new HashMap<Integer,Planet>();
    int maxFuel=22;
    int selectedPlanetId=0;
    boolean isSourceSelected=true;
    Message currentScore= new Message();
    SpaceShip spaceship=new SpaceShip();
    String playerName="Spartan";
    String newscore="";
    private GreenfootSound bgSound = new GreenfootSound("background.wav");
    private ArrayList<Observer> observers = new ArrayList<Observer>() ;
    AsteroidFactory af = new AsteroidFactory();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public GameWorld()
    {    
        super(1500, 750, 1);
      
                HashMap<Integer,Integer> planetmap = buildMatrix(new int[]{1,2},new int[]{2,4});
          home=new HomePlanet(0,planetmap,120,400);
         planetmap = buildMatrix(new int[]{0,2,3,5},new int[]{2,3,4,1});
          a1=new AlienPlanet(1,planetmap,340,120);
       
         planetmap=buildMatrix(new int[]{0,1,3,4},new int[]{4,3,5,3});
          a2=new AlienPlanet(2,planetmap,340,600);
        
         planetmap = buildMatrix(new int[]{1,2,5,4},new int[]{4,5,2,2});
          a3=new AlienPlanet(3,planetmap,580,300);
         
         planetmap = buildMatrix(new int[]{2,3,5,6,8},new int[]{3,2,2,3,7});
          a4=new AlienPlanet(4,planetmap,800,620);
         
         planetmap = buildMatrix(new int[]{1,3,4,7},new int[]{1,2,2,7});
          a5=new AlienPlanet(5,planetmap,800,120);
         
         planetmap = buildMatrix(new int[]{4,7,8},new int[]{3,2,3});
          a6=new AlienPlanet(6,planetmap,1100,360);
         
         planetmap = buildMatrix(new int[]{5,6,8},new int[]{7,2,4});
          a7=new AlienPlanet(7,planetmap,1300,150);
          
         planetmap = buildMatrix(new int[]{7,6,4},new int[]{4,3,7});
          a8=new AlienPlanet(8,planetmap,1300,620);

           
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
     playerName = JOptionPane.showInputDialog("Please Enter Your Name Spartan !");   
     Score.playerName=playerName;
     bgSound.play();
     //Creating object of the factory class 
     Asteroids meteorite ;
     Asteroids comets;
     meteorite = (Meteorite) af.getType("Meteorite");
     comets =  (Comets)af.getType("Comet");
   
     addObject(meteorite,250,210);//between home and 1
     addObject(comets,170,300);//between home and 1

     meteorite=af.getType("Meteorite"); //between 3 and 1
     addObject(meteorite,380,160);
     
     meteorite=af.getType("Meteorite"); //between 3 and 1
     addObject(meteorite,420,200);
     
     meteorite=af.getType("Meteorite"); //between 3 and 1
     addObject(meteorite,460,240);
     
     meteorite=af.getType("Meteorite"); //between 3 and 1
     addObject(meteorite,500,270);
     
     comets =  af.getType("Comet");
     addObject(comets,550,130); ////between 5 and 1
     
     comets =  af.getType("Comet");
     addObject(comets,200,500);//between h and 2
     meteorite=af.getType("Meteorite");
     addObject(meteorite,170,470); //between h and 2
     comets =  af.getType("Comet");
     addObject(comets,230,530);//between h and 2
     meteorite=af.getType("Meteorite");
     addObject(meteorite,260,560); //between h and 2
     
     meteorite=af.getType("Meteorite");
     addObject(meteorite,460,600); //between 2 and 4
     comets =  af.getType("Comet");
     addObject(comets,590,600); //between 2 and 4
     meteorite=af.getType("Meteorite");
     addObject(meteorite,720,610); //between 2 and 4
    
     meteorite=af.getType("Meteorite");
     addObject(meteorite,340,240); //between 2 and 1
     comets =  af.getType("Comet");
     addObject(comets,340,430); //between 2 and 1
     meteorite=af.getType("Meteorite");
     addObject(meteorite,340,350); //between 2 and 1
     
     comets =  af.getType("Comet");
     addObject(comets,400,540);//between 2 and 3
     meteorite=af.getType("Meteorite");
     addObject(meteorite,530,380);//between 3 and 2
     comets =  af.getType("Comet");
     addObject(comets,490,430);//between 3 and 2
     meteorite=af.getType("Meteorite");
     addObject(meteorite,460,460); //between 3 and 2'
     comets =  af.getType("Comet");
     addObject(comets,430,500);//between 2 and 3

     
     comets =  af.getType("Comet");
     addObject(comets,630,420); ////between 3 and 4
     comets =  af.getType("Comet");
     addObject(comets,750,550); ////between 3 and 4 
     
     comets =  af.getType("Comet");
     addObject(comets,730,170); ////between 3 and 5
     comets =  af.getType("Comet");
     addObject(comets,660,240); ////between 3 and 5 
     
     comets =  af.getType("Comet");
     addObject(comets,800,260); ////between 5 and 4
     comets =  af.getType("Comet");
     addObject(comets,800,490); ////between 5 and 4 
     
      
     comets =  af.getType("Comet");
     addObject(comets,1000,130); //between 5 and 7
     comets =  af.getType("Comet");
     addObject(comets,1100,130); //between 5 and 7
     comets =  af.getType("Comet");
     addObject(comets,1050,130);  //between 5 and 7
     meteorite=af.getType("Meteorite");
     addObject(meteorite,950,130);//between 5 and 7
     meteorite=af.getType("Meteorite");
     addObject(meteorite,900,130);//between 5 and 7
     comets =  af.getType("Comet");
     addObject(comets,1150,130); //between 5 and 7
     comets =  af.getType("Comet");
     addObject(comets,1200,130);// between 5 and 7
    
     comets =  af.getType("Comet");
     addObject(comets,900,630); //between 4 and 8
     comets =  af.getType("Comet");
     addObject(comets,1000,630); // between 4 and 8
     comets =  af.getType("Comet");
     addObject(comets,1050,630); //between 4 and 8
     meteorite=af.getType("Meteorite");
     addObject(meteorite,1100,630);//between 4 and 8
     meteorite=af.getType("Meteorite");
     addObject(meteorite,1150,630);//between 4 and 8
     comets =  af.getType("Comet");
     addObject(comets,1200,630); //between 4 and 8
     comets =  af.getType("Comet");
     addObject(comets,950,630);// between 4 and 8
     
     meteorite=af.getType("Meteorite");
     addObject(meteorite,1250,230); //between 6 and 7
     meteorite=af.getType("Meteorite");
     addObject(meteorite,1200,280); //between 6 and 7
     
     comets =  af.getType("Comet");
     addObject(comets,1300,450); ////between 7 and 8
     comets =  af.getType("Comet");
     addObject(comets,1300,250); ////between 7 and 8
     comets =  af.getType("Comet");
     addObject(comets,1300,350); ////between 7 and 8
     comets =  af.getType("Comet");
     addObject(comets,1300,550); ////between 7 and 8
     
     comets =  af.getType("Comet");
     addObject(comets,1150,460); //between 6 and 8
     meteorite=af.getType("Meteorite");
     addObject(meteorite,1200,500); //between 6 and 8
     comets =  af.getType("Comet");
     addObject(comets,1240,540); //between 6 and 8
     
     comets =  af.getType("Comet");
     addObject(comets,1050,440);//between 6 and 4
     meteorite=af.getType("Meteorite");
     addObject(meteorite,970,500);//between 6 and 4
     comets =  af.getType("Comet");
     addObject(comets,900,560);//between 6 and 4
    
     
     
     
     
     addObject(home,120,400);
     addObject(spaceship,120,350);        
      
     addObject(a1,340,120);
     addObject(a2,340,600);
     addObject(a3,580,300);
     addObject(a4, 800,620);
     addObject(a5,800,120);
     addObject(a6,1100,360);
     addObject(a7,1300,150);
     addObject(a8,1300,620);

  
    // addObject(m,670,450);
    
     //Greenfoot.playSound("background.wav"); 

     showText("Fuel", 20, 20);
     addObject(currentScore,150,20);
     currentScore.setText(String.valueOf(maxFuel));
     observers.add(currentScore);
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
         p.alienGrow();
    }
    }    
    public void updatePlanetCount(){
        noOfPlanetsCaptured++;
    }
    public  void attach(Observer obj){
        observers.add(obj) ;
    }
    
    public  void detach(Observer obj){
        observers.remove(obj) ;
    }
    public  void notifyObservers(){
        for (Observer obj  : observers)
        {
            obj.update();
        }
    }
 public String getState() {
        return newscore ;
    }
  public void updateScore(int wieght){  
      score=score+wieght;
      maxFuel=maxFuel-wieght;
      newscore=String.valueOf(maxFuel);
      notifyObservers();
      //currentScore.setText(""+newscore);
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
    
    void activateNeighbourAlien(int key){
        if (key==0){
        return;
        }
        AlienPlanet p=(AlienPlanet)universeMatrix.get(key);
        if(!p.isCaptured){  
         p.activateAlien();
    }
    } 
     public void setPlayerName(String name){
     this.playerName=name;
    
    }
    public String getPlayerName(){
    return this.playerName;
    }
    
    public void stopBgSound(){
        bgSound.stop();
    }
}
