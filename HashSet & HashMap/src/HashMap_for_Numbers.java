import java.util.Scanner;

public class HashMap_for_Numbers {
      public static class Hashmap_{
            public static class Pair{
                  int key;
                  int value;
                  Pair(int key, int value){
                        this.key = key;
                        this.value = value;
                  }
            }

            static Pair[] map;
            static int lastmax = 0;
            Hashmap_(){
                  map = new Pair[100001];
            }
            public static void add(int k){
                  if(map[k] == null){
                        map[k] = new Pair (k, 1);
                  }else{
                        Pair pair = map[k];
                        int val = pair.value;
                        map[k] = new Pair (k, val + 1);
                  }
                  lastmax = Math.max(k , lastmax);
            }
            public static void put(int k , int v){
                  Pair pair = new Pair (k , v);
                  map[k] = pair;
                  lastmax = Math.max(k , lastmax);
            }
            public static void remove(int k){
                  map[k] = null;
            }
            public static boolean containsKey(int k){
                  if(map[k] != null){
                        System.out.println("True");
                        return true;
                  }else{
                        System.out.println("False");
                        return false;
                  }
            }
            public static void display(){
                  System.out.println("HashMap : ");
                  for(int i = 0; i <= lastmax; i++){
                        if(map[i] != null){
                              System.out.println("["+map[i].key +"->"+map[i].value+"]");
                        }
                  }
            }
      }

      public static void main(String[] args){
            Scanner scan = new Scanner (System.in);

            Hashmap_ map = new Hashmap_ ();

            map.add(1);
            map.add(2);
            map.add(3);
            map.add(2);
            map.add(3);
            map.add(1);
            map.add(2);
            map.add(3);

            map.display();
      }
}
