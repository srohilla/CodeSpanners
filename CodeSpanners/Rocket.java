import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{  int startPlanetId;
    int end;
  
    int mouseX, mouseY ;
    public Rocket(int id)
    {   startPlanetId=id;
        GreenfootImage image = getImage() ;
        image.scale(30,90) ;
    }
    public void act() 
    {
        
    if(Greenfoot.mouseClicked(this))
         {   
              
              GameWorld g=(GameWorld) getWorld();
             g.selectedPlanetId=startPlanetId;
             
            
         }
    }  
    
    public void appear()
    {
        
    }
    
    public void disappear()
    {
        //To do code
    }
    
    public void travel(int xLoc,int yLoc)
    {
        
     
    }
      
}
