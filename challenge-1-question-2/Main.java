/*1. Initialize count = 0
2. take the first item of list a 
a. determine if the item exists in list b by traverse list b and comparing each item
b. Increment count
c. repeat until a is traversed
e. reverse list a and list b, repeat the same procedure */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] p={4,3,9,0,2,8};
    int[] d={9,8,7,2,0,5};
    reconcileHelper(p,d);
  }
  
  static void reconcileHelper(int[] a, int[] b) {
    // your code here
    List<Integer> list1 =Arrays.stream(a).boxed().collect(Collectors.toList()); 
    List<Integer> list2 =Arrays.stream(b).boxed().collect(Collectors.toList()); 
    for(int k = 0;k < a.length;k++){
      for(int i : b){
        if(i==a[k]){
          Integer value=a[k];
          list1.remove(value);
        }
      } 
    }

    for(int k = 0;k < b.length;k++){
      for(int i : a){
        if(i==b[k]){
          Integer value=b[k];
          list2.remove(value);
        }
      } 
    }

    System.out.print("Numbers in array a that aren't in array b:"+"\n");
    for(int el : list1)
    {
        System.out.print(el+" ");
    }

    System.out.print("\n"+"Numbers in array b that aren't in array a:"+"\n");
    for(int el : list2)
    {
        System.out.print(el+" ");
    }
    
  }
}
