import greenfoot.*; 
 import java.util.*;
/**
 * Write a description of class SpaceShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceShip extends Actor implements movableObjects
{
     int start;
    int end;
    public boolean move;
    int mouseX, mouseY ;
    int dX;
    int dY;
    GameWorld g=(GameWorld) getWorld();
    boolean signal=true;
    public SpaceShip()
    {
        GreenfootImage image = getImage() ;
        image.scale(100,80) ;
        dX=120;
        dY=400;
    }
    public void act() 
    {
        
        while(this.getX()!=this.dX || this.getY()!=dY){
                if(this.dX>this.getX()){
                     
                    setLocation(getX()+1,getY());
                    }
                    if(this.dX<this.getX()){
                    setLocation(getX()-1,getY());
                    }
                   if(this.dY>this.getY()){
                    setLocation(getX(),getY()+1);
                    }
                    if(this.dY<this.getY()){
                    setLocation(getX(),getY()-1);
                    }
                    if(this.getX()==this.dX && this.getY()==dY){
                        signal=false;
                    }
                    Greenfoot.delay(1);
               }
            }
    public void setDestination(ArrayList<Planet> a){
       for(Planet p:a){
            while(signal){
                dX=p.getX();
                dY=p.getY();
                act();
                if(this.getX()==this.dX && this.getY()==dY){
                        signal=false;
                    }
            }
            
            Greenfoot.delay(10);
            signal=true;
        }

        for(int i=a.size()-2;i>=0;i--){
            while(signal){
                dX=a.get(i).getX();
                dY=a.get(i).getY();
                act();
                if(this.getX()==this.dX && this.getY()==dY){
                        signal=false;
                    }
            }
            Greenfoot.delay(10);
            signal=true;
        } 
    }
    public void appear()
    {
        //To do code
       // if(getY()<560 && getX()<700 )
    
        
    }
    
    public void disappear()
    {
        //To do code
    }
    
    public void travel()
    {
        //To do code
    }
    
}
