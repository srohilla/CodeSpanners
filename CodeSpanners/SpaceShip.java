import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceShip extends Actor implements movableObjects
{
    /**
     * Act - do whatever the SpaceShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int start;
    int end;
    
    int mouseX, mouseY ;
    public SpaceShip(){
        GreenfootImage image = getImage() ;
        image.scale(100,100) ;
    }
    public void act() 
    {
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        }
        // Add your action code here.
    }  
    
    public void appear()
    {
        //To do code
    }
    
    public void disappear()
    {
        //To do code
    }
    
    public void travel()
    {
        //To do code
    }
    
}
