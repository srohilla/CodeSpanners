import greenfoot.*;

/**
 * Over class holds the basic logic and rendering of Game Over Scenario
 * 
 */
public class Over extends World
{

    public Over()
    {    
       
        super(800, 600, 1);  
       
        addObject(new GameOver(),400, 300);
         
 
    }
        public void act(){
        
     
      if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MenuWorld());
        }
    
    }
}
