import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpGameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpGameWorld extends World
{

    /**
     * Constructor for objects of class HelpGameWorld.
     * 
     */
    private BackButton bb;
    private BackCommand bc;
    public HelpGameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 780, 1);
        bb = new BackButton("Back");
        bc = new BackCommand();
        addObject(bb,100,300);
        prepare();
    }
    private void prepare()
    {
       
        bb.setCommand(bc);
        bc.setReceiver(
        new Receiver()
        {
            public void doAction()
            {
                if(Greenfoot.mouseClicked(bb)){
                    World newWorld = new MenuWorld();
                    Greenfoot.setWorld(newWorld);
                }
            }
        } );
        
    }
}
