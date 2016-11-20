import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class AlienPlanet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienPlanet extends Planet 
{
    boolean isBlue;
    int weight[];
    int planetNumber;
    boolean drag=false;
    GifImage planet= new GifImage("alienPlanet1.gif");
    int rx=0;
    int ry=0;
    String name;
    

    //Actor alien = getOneObjectAtOffset(0,0, Aliens.class);  
    /**
     * Act - do whatever the AlienPlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public AlienPlanet(String s){
  //      this.getImage().scale(50,50);
        name=s;
    }
    public void act() 
    {
            GameWorld g=(GameWorld) getWorld();
             SpaceShip s=g.getSpaceShip();
        
        if(Greenfoot.mouseClicked(this) && !super.isVisited)
         {  
             for(Planet p:g.planet[Integer.parseInt(g.atPlanet.substring(0,1))][Integer.parseInt(g.atPlanet.substring(1))].path){
                 super.path.add(p);
            }
            
             super.path.add(this);
            /* for(int i=g.planet[Integer.parseInt(g.atPlanet.substring(0,1))][Integer.parseInt(g.atPlanet.substring(1))].path.size()-1;i>=0;i--){
                 super.path.add(g.planet[Integer.parseInt(g.atPlanet.substring(0,1))][Integer.parseInt(g.atPlanet.substring(1))].path.get(i));
                } */
             s.setDestination(super.path);
             super.isVisited=true;
             g.setPlanet(name);
         }else if(Greenfoot.mouseClicked(this) && super.isVisited){
             g.setPlanet(name);
            }
         
   // World world = getWorld();    
        // Add your action code here.
     
     /*if(Greenfoot.mouseDragged(this)){
         MouseInfo m=Greenfoot.getMouseInfo();
            if(!drag){
                drag=true;
                rx=getX()-m.getX();
                ry=getY()-m.getY();
            }else{
                setLocation(m.getX()+rx,m.getY()+ry);
            }
            if(Greenfoot.mouseDragEnded(this)){
                drag=false;
            }
            
            System.out.println("Insise");
            Actor a=Greenfoot.getMouseInfo().getActor();
            GameWorld g=(GameWorld) getWorld();
            SpaceShip s=g.getSpaceShip();
            s.setLocation(a.getX(),a.getY());
        
        }*/
        //setImage(planet.getCurrentImage());
      //  capture();
    // Greenfoot.delay(100);
    // world.removeObject(alien);
    //setImage(planet.getCurrentImage());
    }    
    
    public void capture()
    {
    //to do
    
    
    Actor alien = getOneObjectAtOffset(0,0, Aliens.class); 
    Greenfoot.delay(100);
    getWorld().removeObject(alien);
    getWorld().addObject(new Soldier(),660,100);
    getWorld().addObject(new Soldier(),660,500);
    
    }
    
    public void uncapture()
    {
        
    }
}
