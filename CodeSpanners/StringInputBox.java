import greenfoot.*;  
import java.awt.Color;
/**
 * StringInputBox to take input from player
 * 
 */
public class StringInputBox extends Actor
{
    static final int MAX_INPUT_LENGTH = 20;
    String text = "Enter your Name :";
    String name="Player1";
    public StringInputBox()
    {
        updateImage();
        text = "";
    }
     
   
       private void updateImage()
{
    GreenfootImage image = new GreenfootImage(16*MAX_INPUT_LENGTH+32, 30);
    image.setColor(new Color(128, 0, 0));
    image.fill();
    image.setColor(Color.WHITE);
    image.fillRect(3, 3, image.getWidth()-6, 24);
    for (int i=0; i<text.length(); i++)
    {
        GreenfootImage chrImage = new GreenfootImage(""+text.charAt(i), 24, Color.black, null);
        image.drawImage(chrImage, 24+16*i-chrImage.getWidth()/2, 15-chrImage.getHeight()/2);
    }
    setImage(image);
}
    
 
    public void act()
    {     
        String key = Greenfoot.getKey();
        if (key == null) return;
        if ("enter".equals(key) && text.length() > 0)
        {
          
            name=text;
            System.out.println("Your name :"+name);
           
            updateImage();
             MenuWorld g=(MenuWorld) getWorld();
             g.setPlayerName(name);
             g.removeObject(this);
            
            return;
        }
        if ("backspace".equals(key) && text.length() > 0) text = text.substring(0, text.length() - 1);
        if ("escape".equals(key)) text = "";
        if ("space".equals(key)) key = " ";
        if (key.length() == 1 && text.length() < MAX_INPUT_LENGTH) text += key;
        updateImage();
    }   
}
