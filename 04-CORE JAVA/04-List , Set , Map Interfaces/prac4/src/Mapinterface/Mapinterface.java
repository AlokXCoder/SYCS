package Mapinterface;
import java.util.*;
public class Mapinterface {
public static void main(String[] args) {
 Map<Integer,String> map=new HashMap<Integer,String>();
 map.put(112,"Elliot");
 map.put(113,"IronMan");
 map.put(114,"AlokJ");
 for(Map.Entry m:map.entrySet())
 {
 System.out.println(m.getKey()+" "+m.getValue());
 }
 }
}