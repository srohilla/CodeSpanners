/**
 * 
 * Asteroid factory implements factory pattern to create objects of Asteroids
 * 
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
