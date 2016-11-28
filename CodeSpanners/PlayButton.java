import greenfoot.*; 

public class PlayButton extends Button implements Invoker{
 
    private Command PlayCommand;
    public PlayButton(String title)
    {
        super(title);
         GreenfootImage image = getImage() ;
        image.scale(100,100) ;
    }
    

    public void invoke()
    {
        if (Greenfoot.mouseClicked(this)) 
        PlayCommand.execute();
     }
    
    public void setCommand(Command c){
        this.PlayCommand = c;
    }
   
}
