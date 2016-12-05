import greenfoot.*;  
import java.awt.Font;
import java.awt.Color;
/**
 * Restart Class to restart the game when you press Enter
 * 
 */
public class Restart extends Actor
{
   /**
     * Act - do whatever the obj_restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MenuWorld());
        }
    }  
    
     GreenfootImage text = new GreenfootImage(400, 80);

  public Restart() {
    Font f = new Font("Arial", 1, 30);
    this.text.setFont(f);
    this.text.setColor(Color.white);
  
    setImage(this.text);
  }  
}
