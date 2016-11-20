import greenfoot.*;
import java.util.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienPlanet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienPlanet extends Planet 
{
   GreenfootImage textImage = new GreenfootImage(String.valueOf(planetNumber), 24, new Color(0, 255, 128), new Color(0, 0, 0, 0));
   GreenfootImage image = new GreenfootImage(textImage.getWidth()+12, 36);GifImage planet= new GifImage("alienPlanet1.gif");
   Rocket s=getRocket();

    
    
    //Actor alien = getOneObjectAtOffset(0,0, Aliens.class);  
    /**
     * Act - do whatever the AlienPlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public AlienPlanet(){
        super();
        
  //      this.getImage().scale(50,50);
    }
    public AlienPlanet(int planetNumber,HashMap<Integer,Integer> adjMatrix,int xLoc,int yLoc){
        super();
        this.xLoc=xLoc;
        this.yLoc=yLoc;
        this.planetNumber=planetNumber;
        this.neighbourMatrix=adjMatrix;
         image.setColor(new Color(196, 196, 0));
         image.fill();
         image.setColor(new Color(0, 0, 196));
         image.fillRect(3, 3, image.getWidth()-6, 30);
         image.drawImage(textImage, xLoc, yLoc);
       //  Message m=new Message(planetNumber);
        // GameWorld g=(GameWorld) getWorld();
      //   g.addObject(m,xLoc-10,yLoc-5);
  //      this.getImage().scale(50,50);
    }
    public void act() 
    {  
         
     capture();
    // selection();
    setImage(planet.getCurrentImage());
    }    
    
    public void capture()
    {     GameWorld g=(GameWorld) getWorld();
      
         
         if(Greenfoot.mouseClicked(this))
         {   if(isClickable){
             if(isCaptured){
             
           
             g.selectedPlanetId=planetNumber;
             g.isSourceSelected=true;
             System.out.println("selected id:"+g.selectedPlanetId);
             
            
         }
             else if((!isCaptured)&&(g.isSourceSelected)&&(neighbourMatrix.containsKey(g.selectedPlanetId))){
            
           
             isCaptured=true;
             g.addObject(s,xLoc,yLoc);
             System.out.println("planet count :"+g.noOfPlanetsCaptured);
             g.updatePlanetCount();
             
             int wieght=neighbourMatrix.get(g.selectedPlanetId);
             g.updateScore(wieght);
             System.out.println("now score :"+g.score);
             g.isSourceSelected=false;
             //alienDestroy();
            // s.travel(xLoc,yLoc);
            Set<Integer> keys=neighbourMatrix.keySet();
            for(Integer k:keys){
           
             g.check(k);
            
            
            }
            }else{
            Message m=new Message();
            g.addObject(m,190,190);
            m.setText("Ohh shittts");
        }
            
         }}
        
    }
    public void selection(){
    
    }
    
  public Rocket getRocket(){
    Rocket ss=new Rocket(planetNumber);
    return ss;
   
    } 
    
 public void alienGrow(){
    GameWorld g=(GameWorld) getWorld();
    g.addObject(new Aliens(),xLoc, yLoc);
    }  
    
public void alienDestroy(){
    GameWorld g=(GameWorld) getWorld();
    //g.removeObject(new Aliens(),xLoc, yLoc);
}    
   
}
