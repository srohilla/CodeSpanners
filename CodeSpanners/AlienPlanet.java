import greenfoot.*;
import java.util.*;
import java.awt.Color;


/**
 * Holds the logic of Alien planet 
 * 
 */
public class AlienPlanet extends Planet 
{
   GreenfootImage textImage = new GreenfootImage(String.valueOf(planetNumber), 24, new Color(0, 255, 128), new Color(0, 0, 0, 0));
   GreenfootImage image = new GreenfootImage(textImage.getWidth()+12, 36);
   PlanetState state;
  
   Rocket s=getRocket();
   Aliens alien=new Aliens();
    GifImage planet= new GifImage("nplanet.gif");
     GifImage cplanet= new GifImage("planet.gif");
     

     PlanetState originalState;
     PlanetState capturedState;
 
    /**
     * Act - do whatever the AlienPlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public AlienPlanet(){
        super();
        
    }
    public AlienPlanet(int planetNumber,HashMap<Integer,Integer> adjMatrix,int xLoc,int yLoc){
        super();
        this.xLoc=xLoc;
        this.yLoc=yLoc;
        this.planetNumber=planetNumber;
        this.neighbourMatrix=adjMatrix;
        this.originalState=new OriginalState(this);
        this.capturedState=new CapturedState(this);
         image.setColor(new Color(196, 196, 0));
         image.fill();
         image.setColor(new Color(0, 0, 196));
         image.fillRect(3, 3, image.getWidth()-6, 30);
         image.drawImage(textImage, xLoc, yLoc);
        this.state= originalState;
     
    }
    public void act() 
    {     setImage(planet.getCurrentImage());
         
           if(isCaptured)
          {
              setImage(cplanet.getCurrentImage());
          }
          else
          {
            setImage(planet.getCurrentImage());
          }
          
          
        GameWorld g=(GameWorld) getWorld();
        if(g.getMaxFuel()<= 0)
        {g.stopBgSound();
             Greenfoot.setWorld(new Over());
        }
        else if(g.checkAllCaptured()){
            g.stopBgSound();
             Score.score=g.getMaxFuel();
     
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
             state.capture(g); 
         }
        }
        
    }
  
  public Rocket getRocket(){
    Rocket ss=new Rocket(planetNumber);
    return ss;
   
    } 
    
 public void alienGrow()
 {
    GameWorld g=(GameWorld) getWorld();
    g.addObject(alien,xLoc, yLoc-40);
   
 }  
   
 public void activateAlien(){
    alien.react();
    } 
  public PlanetState getState(){
      return state;
    }  
   public void setState(PlanetState state){
    this.state=state;
    }
    public PlanetState getOriginalState(){
      return originalState;
    } 
    public PlanetState getCapturedState(){
      return capturedState;
    } 
    
    public void isCaptured(){
    this.isCaptured=true;
    }
     public void displayMessage(){
       GameWorld g=(GameWorld) getWorld();
        Message msg=new Message("Please select the source",170,20);
        
        g.addObject(msg,xLoc, yLoc);
        
        Greenfoot.delay(60);
        
        g.removeObject(msg);
       
    }
}
