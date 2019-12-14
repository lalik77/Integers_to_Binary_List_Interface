import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

public static void main(String[] args) {
  
  List<Integer>  list = Arrays.asList(5,3,7,10,14);
  List<String> list_str = new ArrayList<String>();
  
  System.out.println("List of integers on decimal  " + list.toString());
  
   for (int i=0;i<list.size();i++) {
           
            int decimal=list.get(i);
            String str=  Integer.toBinaryString(decimal);                     
            list_str.add(str);

        }
  
  
  System.out.println("List of integers on binary " + list.toString());


      }


}
