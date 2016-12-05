import greenfoot.*; 

/**
 * RankingWorld class holds the basic logic and rendering of the Ranking World 
 * 
 */
public class RankingWorld extends World
{

    /**
     * Constructor for objects of class RankingWorld.
     * 
     */
    public RankingWorld()
    {    
  
        super(800, 600, 1); 
        Ranking rank=new Ranking();
        addObject(rank,400, 300);
        rank.getRanking();
        
    }
        public void act(){
        
     
      if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MenuWorld());
        }
    
    }
    
   
}
