/**
 * Write a description of class AsteroidFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsteroidFactory  
{
    
    public AsteroidFactory()
    {
    }

    public Asteroids getType(String AsteroidType)
    {
    if(AsteroidType == null)
    {   
        return null; 
    }
    if(AsteroidType.equalsIgnoreCase("Comet"))
    {
     return new Comets();
    }
    if(AsteroidType.equalsIgnoreCase("Meteorite"))
    {
     return new Meteorite();
    }
    else
    return null;
    
   }
}
