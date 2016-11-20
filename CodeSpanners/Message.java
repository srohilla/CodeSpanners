import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * The meesage class is designed to be used as a framework to display various text messages
 * 
 * @author (Shruti) 
 * @version (9/17/2016)
 */
public class Message extends Actor
{
    GreenfootImage img;
    int planetId;
    String msg = "Planet ID :"+String.valueOf(planetId);
    
    public Message(){ 
        img = new GreenfootImage(msg, 50, java.awt.Color.RED, java.awt.Color.GREEN); 
       
        setImage(img);
        
    }
    
    public void setText(String msg){ 
       
        img = getImage();
        img.clear();
        img.setColor( java.awt.Color.GREEN); 
        img.fill();
        img.setColor( java.awt.Color.RED);
        img.setFont(new java.awt.Font("Default", java.awt.Font.PLAIN, 40));
        img.drawString(msg, 0, 40); 
    }

    
    
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
