import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    this.text.drawString("Press enter to restart", 50, 50);
    setImage(this.text);
  }  
}
