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
        Score score=new Score();
        HashMap<String,String> map=score.getScores(); 
        System.out.println("scoreMap: " + map);
        HashMap<String,String> resultmap=sortByValues(map);
        System.out.println("SortedscoreMap: " + resultmap);
       
       
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
       //to reverse the order from ascending to descending
       Collections.reverseOrder(cmp);
       Collections.sort(list,cmp);

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
