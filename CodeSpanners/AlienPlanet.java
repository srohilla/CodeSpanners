import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienPlanet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienPlanet extends Planet 
{
    boolean isBlue;
    int weight[];
    int planetNumber;
    boolean drag=false;
    GifImage planet= new GifImage("alienPlanet1.gif");
    int rx=0;
    int ry=0;
    
    //Actor alien = getOneObjectAtOffset(0,0, Aliens.class);  
    /**
     * Act - do whatever the AlienPlanet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public AlienPlanet(){
        this.getImage().scale(150,150);
    }
    public void act() 
    {
   // World world = getWorld();     
        // Add your action code here.
     
     /*if(Greenfoot.mouseDragged(this)){
         MouseInfo m=Greenfoot.getMouseInfo();
            if(!drag){
                drag=true;
                rx=getX()-m.getX();
                ry=getY()-m.getY();
            }else{
                setLocation(m.getX()+rx,m.getY()+ry);
            }
            if(Greenfoot.mouseDragEnded(this)){
                drag=false;
            }
            
            System.out.println("Insise");
            Actor a=Greenfoot.getMouseInfo().getActor();
            GameWorld g=(GameWorld) getWorld();
            SpaceShip s=g.getSpaceShip();
            s.setLocation(a.getX(),a.getY());
        
        }*/
        //setImage(planet.getCurrentImage());
      //  capture();
    // Greenfoot.delay(100);
    // world.removeObject(alien);
    setImage(planet.getCurrentImage());
    }    
    
    public void capture()
    {
    //to do
    
    
    Actor alien = getOneObjectAtOffset(0,0, Aliens.class); 
    Greenfoot.delay(100);
    getWorld().removeObject(alien);
    getWorld().addObject(new Soldier(),660,100);
    getWorld().addObject(new Soldier(),660,500);
    
    }
    
    public void uncapture()
    {
        
    }
}
