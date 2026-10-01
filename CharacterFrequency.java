  
  import java.util.*;
  import java.util.stream.*;
  import java.util.function.*;
  
 public class CharacterFrequency{

    public static void main(String args[]){
    
      String str="Shlok Kumar Mishra";
      

       Map<Character,Long> map=str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       
      map.entrySet().stream().filter(entry->entry.getValue()>0).forEach((result)->System.out.println(result));
   }

}