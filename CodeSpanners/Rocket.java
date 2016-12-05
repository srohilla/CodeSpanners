import greenfoot.*; 
/**
 * Rocket for showing that planet is captured
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
    
   
      
}
