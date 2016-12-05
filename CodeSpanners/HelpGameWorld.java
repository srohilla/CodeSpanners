import greenfoot.*; 

/**
 * HelpGameWorld class holds the basic logic and rendering of the HelpGame World 
 * 
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
        
        super(1600, 900, 1);
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
