import greenfoot.*;  
import java.awt.Color;


/**
 * MenuWorld class holds the basic logic and rendering of the MenuWorld World 
 * 
 */
public class MenuWorld extends World
{
    /**
     * Constructor for objects of class MenuWorld.
     */
    private String playerName;
    private PlayButton pb;
    private PlayCommand pc;
    private HelpButton hb;
    private HelpCommand hc;
    public MenuWorld()
    {
        super(1600, 780, 1);
        pb = new PlayButton("Play"); //invoker PlayButton
        pc = new PlayCommand(); //menu world created a concrete command object.
        addObject(pb,50,100);
        hb = new HelpButton("Help");
        hc = new HelpCommand();
        addObject(hb,50, 300);
        prepare();      
    }
    
  
    public void prepare(){
             // addObject(new StringInputBox(),300,500);
            

                pb.setCommand(pc); //invoker object stores the concretecommand object in this case playcommand
                pc.setReceiver(   //command object has reference to the receiver object.
                new Receiver() 
                {
                    
                    public void doAction() //This is actual action which should happen on click on Play Button
                    {
                     if(Greenfoot.mouseClicked(pb)){
                      //  String inputValue = JOptionPane.showInputDialog("Please input a value");

                        World newWorld = new GameWorld();
                        Greenfoot.setWorld(newWorld);
                    }
                }
            });
            
              hb.setCommand(hc);
              hc.setReceiver(
              new Receiver() 
                {
                    
                    public void doAction()
                    {
                     if(Greenfoot.mouseClicked(hb)){
                       
                        World newWorld = new HelpGameWorld();
                        Greenfoot.setWorld(newWorld);
                    }
                    
                }
            });
          
        }
      public void setPlayerName(String name){
        playerName=name;
        }     
        public String getPlayerName(){
        return playerName;
        }
    
}


    
    
    
    
 