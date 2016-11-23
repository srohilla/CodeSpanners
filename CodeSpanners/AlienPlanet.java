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
   Aliens alien=new Aliens();
   
    
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
         
     
    }
    public void act() 
    {  
         setImage(planet.getCurrentImage());
        GameWorld g=(GameWorld) getWorld();
        if(g.getMaxFuel()<= 0)
        {
             Greenfoot.setWorld(new Over());
        }
        else if(g.checkAllCaptured()){
             World newWorld = new WinWorld();
             Greenfoot.setWorld(newWorld);
        
        }
        else
        {
            capture();
            
            
         
        }
    }    
    
    public void capture()
    {     
      GameWorld g=(GameWorld) getWorld();
         
         if(Greenfoot.mouseClicked(this))
         {   if(isClickable){
             if(isCaptured){
              
             
             g.selectedPlanetId=planetNumber;
             g.isSourceSelected=true;
             System.out.println("selected id:"+g.selectedPlanetId);
             
            
         }
             else if((!isCaptured)&&(g.isSourceSelected)&&(neighbourMatrix.containsKey(g.selectedPlanetId))){
            //GreenfootImage myImage = new GreenfootImage("BluePlanet.png");
            //setImage(myImage);
            Greenfoot.playSound("explosion.wav"); 
            isCaptured=true;
             g.removeObject(alien);
             g.addObject(s,xLoc,yLoc-40);
             g.updatePlanetCount();
             
             int wieght=neighbourMatrix.get(g.selectedPlanetId);
             g.updateScore(wieght);
             g.isSourceSelected=false;
            Set<Integer> keys=neighbourMatrix.keySet();
            for(Integer k:keys){
             g.activateNeighbour(k);
            
            }
            }
            
         }
        }
        
    }
  
  public Rocket getRocket(){
    Rocket ss=new Rocket(planetNumber);
    return ss;
   
    } 
    
 public void alienGrow(){
    GameWorld g=(GameWorld) getWorld();
    g.addObject(alien,xLoc, yLoc-40);
    }  
    
    
   
}
