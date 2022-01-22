import java.util.Scanner;

public class Binary_tree_ {
      public static class Node{
            int data;
            Node left;
            Node right;
            Node(int val, Node left, Node right){
                  this.data = val;
                  this.left = left;
                  this.right = right;
            }
      }

      private static Node root;

       Binary_tree_(){
            root = null;
      }

      public static  Node constructor(int[] arr, int high, int low ){
            if(low  > high){
                  return null;
            }
            int mid = (low + high) / 2;
            int data = arr[mid];
            Node left_child = constructor(arr, low, mid-1);
            Node right_child = constructor(arr, mid+1, high);
            Node node = new Node(data, left_child, right_child);
            return node;
      }

      public static void display(Node node){
            if(node == null){
                  return;
            }
            String str = "";
            str += node.left == null ? "." : node.left.data ;
            str += " <- "+node.data +" -> ";
            str += node.right == null ? "." : node.right.data;
            System.out.println(str);

            display(node.left);
            display(node.right);
      }
      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int[] arr = { 12,25,37,50,62,75,87};
            int high = arr.length - 1;
            int low = 0;

            Node root = constructor(arr, low , high);                       //calling the constructor method to create the binary search tree..
            display(root);
      }
}
