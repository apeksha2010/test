package test;

import java.util.Collection;
import java.util.HashMap;
  
public class HashMapExample1
{    
    public static void main(String[] args) 
    {
       
         HashMap<Integer, String> map = new HashMap<Integer, String>();
         
        map.put(1, "AAA");
         
        map.put(2, "BBB");
         
        map.put(3, "CCC");
         
        map.put(4, "DDD");
         
        map.put(5, "EEE");
         
           Collection<String> values = map.values();
         
        for (String value : values) 
        {
            System.out.println(value);
        }
    }   
}