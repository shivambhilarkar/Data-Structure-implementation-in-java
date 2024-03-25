package Queue;

import java.util.Arrays;
import java.util.Scanner;

public class Queue_Using_array {
      public static class Queue_{
            static int[] array;
            static int front = 0;
            static int back = 0;
            static int size = 0;
            static int capacity = 10;

            Queue_(){
                  array = new int[capacity]; //default size of queue
            }
            Queue_(int val){
                  capacity = val;
                  array = new int[val];
            }

            private static void add(int value){
                  if(size == capacity){
                        System.out.println("Queue Overflowed...");
                  }else{
                        size += 1;
                        array[back] = value;
                        back = (++back) % (capacity-1);   //this will allow to come at front circularly
                  }
            }
            private static void remove(){
                  if(size == 0){
                        System.out.println("Queue Under flowed...");
                  }else{
                        size -= 1;
                        int value = array[front];
                        array[front] = 0;
                        front = (++front) % (capacity-1);  //this will allow to come at front circularly
                        System.out.println("Removed : "+value);
                  }
            }
            private static void isEmpty(){
                  if(size == 0){
                        System.out.println("Queue is Empty..");
                  }else{
                        System.out.println("Queue is Not Empty...");
                  }
            }

            private static void display_queue(){

                  System.out.println("Queue : "+ Arrays.toString (array));
                  System.out.println("Start At : "+front +" -> End At : "+back);

            }
      }

      public static void main(String[] args){
            Scanner scan = new Scanner (System.in);


            Queue_ queue = new Queue_ ();

            queue.isEmpty();
            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);

            queue.display_queue();

            queue.remove();
            queue.remove();
            queue.display_queue();
            queue.isEmpty();


      }
}
