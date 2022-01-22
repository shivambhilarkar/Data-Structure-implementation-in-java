public class Linked_list_ {
      public static class Node{
            int data;
            Node next;
            Node(int data ) {
                  this.data = data;
                  this.next = null;
            }
      }
      public static Node head;

      public static void add_at_head(int val){
            Node node = new Node(val);
            if(head == null){
                  head = node;
            }else{
                  node.next = head;
                  head = node;
            }
      }
      public static void add_at_tail(int val) {
            Node node = new Node (val);
            if (head == null) {
                  head = node;
            } else {
                  Node temp = head;
                  while (temp.next != null) {
                        temp = temp.next;
                  }
                  temp.next = node;
            }
      }
      public static void delete_from_front(){
            if(head == null){
                  System.out.println("Underflow....");
            }else{
                  int deleted = head.data;
                  head = head.next;
                  System.out.println("Deleted Front: "+deleted);
            }
      }
      public static void delete_from_last(){
            if(head == null){
                  System.out.println("Underflow....");
            }else{
                  Node temp = head;
                  while(temp.next.next != null){
                        temp = temp.next;
                  }
                  int deleted = temp.next.data;
                  temp.next = null;
                  System.out.println("Deleted Last : "+deleted);
            }
      }
      public static void remove_value_node(int val){
            Node temp = head;
            if(head == null){
                  System.out.println("Underflow....");
                  return;
            }
            while(head.data == val) {
                  head = head.next;
            }

            while( temp.next != null){
                  if(temp.next.data == val){
                        temp.next = temp.next.next;
                  }else{
                        temp = temp.next;
                  }
            }
      }
      public static void display_list(){
            Node temp = head;
            System.out.print("Linked List : ");
            while(temp != null){
                  System.out.print(temp.data + "  ");
                  temp = temp.next;
            }
            System.out.println();
      }


}


