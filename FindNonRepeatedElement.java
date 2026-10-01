

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

 
public class FindNonRepeatedElement{
   
    public static void main(String args[]){
    
    String str="swiss";
    
  Map<Character,Long> map=str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   map.entrySet().stream().filter(filter->filter.getValue()==1).findFirst().ifPresent(entry->System.out.println(entry.getKey()));
}
}