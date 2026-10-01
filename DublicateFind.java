

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class DublicateFind{

    public static void main(String args[]){

    String str="programming";
   Map<Character,Long>map =str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     
  map.entrySet().stream().filter(entry->entry.getValue()>1).forEach((result)->System.out.println(result));
   }

}