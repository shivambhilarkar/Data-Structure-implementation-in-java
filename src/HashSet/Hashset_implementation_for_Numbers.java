package HashSet;

import java.util.Scanner;

public class Hashset_implementation_for_Numbers {
      public static class HashSet_{
            static boolean[] array;
            static int lastmax = 0;
            HashSet_(){
                  array = new boolean[100000];
            }

            public static void add(int val){
                  array[val] = true;
                  lastmax = Math.max(lastmax, val);
            }
            public static void remove(int val){
                  array[val] = false;
            }
            public static boolean contains(int val){
                  if(array[val]){
                        System.out.println("Contains...");
                        return true;
                  }else{
                        System.out.println("Not Contains...");
                        return false;
                  }
            }
            public static void display(){
                  System.out.print("HashSet : ");
                  for(int i = 0; i <= lastmax; i++){
                        if(array[i] == true){
                              System.out.print(i + ",");
                        }
                  }
            }

      }


      public static void main(String[] args){
            Scanner scan = new Scanner (System.in);

            HashSet_ set = new HashSet_ ();
            set.add(1);
            set.add(2);
            set.add(7);
            set.add(4);
            set.add(5);

            set.contains(6);
            set.display();
      }
}
