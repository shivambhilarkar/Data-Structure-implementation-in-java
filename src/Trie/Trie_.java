package Trie;

public class Trie_ {
      public static class Node{
            Node[] children = new Node[26];
            boolean isEndofWord;
            Node(){
                  isEndofWord = false;
                  for(int i = 0; i < 26; i++){
                        children[i] = null;
                  }
            }
      }

      static Node root ;
      Trie_(){
            root = new Node();
      }

      public static void insert(String word){
            int len = word.length();
            Node temp = root;
            for(int i = 0; i < len; i++){
                  int index = word.charAt(i) - 'a';
                  if(temp.children[index] == null){
                        temp.children[index] = new Node();
                  }
                  temp = temp.children[index];
            }
            temp.isEndofWord = true;
      }

      public static void search(String word){
            int len = word.length();
            Node temp = root;
            for(int i = 0; i < len; i++){
                  int index = word.charAt(i) - 'a';
                  if(temp.children[index] == null){
                        System.out.println("Word Is Not found!!! ");
                        return;
                  }
                  temp = temp.children[index];
            }

            if(temp!= null && temp.isEndofWord == true){
                  System.out.println("Word Found");
            }else{
                  System.out.println("Word Not Found!!!");
            }
      }


}
