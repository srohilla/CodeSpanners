import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.*;
import java.util.Map;
import java.util.Set;
import java.util.*;

/**
 * Write a description of class Ranking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ranking extends Actor
{  
    /**
     * Act - do whatever the Ranking wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      // Add your action code here.
    }  
        public Ranking(){
        GreenfootImage image = getImage() ;
        image.scale(800,600) ;
    
        
    }
    
    public void getRanking(){
        try{
        
        
        String[] sb =  new String[3];
        HashMap<String,String> map=Score.getScores(); 
      //  System.out.println("scoreMap: " + map);
        HashMap<String,String> resultmap=sortByValues(map);
        System.out.println("SortedscoreMap: " + resultmap);
         Iterator it = resultmap.entrySet().iterator();
         int count=0;
         int rank=0;
         while (it.hasNext()) {
        
          Map.Entry pair = (Map.Entry)it.next();
          if(count<3){
          sb[count]=String.valueOf(pair.getKey());
        }
          if(Score.playerName.equals(pair.getKey())){
            rank=count+1;
            }
        //  System.out.println(pair.getKey() + "--> " + pair.getValue());
          it.remove(); 
    
          count++;
        }
   
      
    
   RankingWorld g=(RankingWorld) getWorld();
        Message msg=new Message(sb[0],170,25);   
        g.addObject(msg,110, 215);
         Message msg1=new Message(sb[1],170,25);   
        g.addObject(msg1,130, 255);
          Message msg2=new Message(sb[2],170,25);   
        g.addObject(msg2,135, 300);
        
        Message msg3=new Message("Your ranking is ---> "+rank,170,40);   
        g.addObject(msg3,250, 400);
       
       
    }
    catch(IOException ex){
    
    }
    }
      private static HashMap sortByValues(HashMap map) { 
       List list = new LinkedList(map.entrySet());
       // Defined Custom Comparator here
       
       Comparator cmp=new Comparator() {
            public int compare(Object o1, Object o2) {
               return ((Comparable) ((Entry) (o1)).getValue())
                  .compareTo(((Entry) (o2)).getValue());
            }
       };
     
       Collections.sort(list,Collections.reverseOrder(cmp));

       // Here I am copying the sorted list in HashMap
       // using LinkedHashMap to preserve the insertion order
       HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Entry entry = (Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
  }

    
}
