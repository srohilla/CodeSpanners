import greenfoot.*; 

public class HelpButton extends Button implements Invoker{
 
    private Command HelpCommand;
    public HelpButton(String title){
        super(title);
          GreenfootImage image = getImage() ;
        image.scale(100,100) ;
    }
    

    public void invoke()
    {
        if (Greenfoot.mouseClicked(this)) 
        HelpCommand.execute();
     }
    
    public void setCommand(Command c){
        this.HelpCommand = c;
    }
 
   
}
