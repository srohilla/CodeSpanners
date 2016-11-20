import greenfoot.*; 
 
/**
 * Write a description of class SpaceShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceShip extends Actor implements movableObjects
{
    int startPlanetId;
    int end;
  
    int mouseX, mouseY ;
    public SpaceShip(int id)
    {   startPlanetId=id;
        GreenfootImage image = getImage() ;
        image.scale(100,80) ;
    }
    public void act() 
    {
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
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
