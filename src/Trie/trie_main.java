package Trie;

import java.util.Scanner;

public class trie_main {

      public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            Trie_ trie = new Trie_();

            String[] dictionary = { "he", "she", "they", "there", "their", "them"};
            for(String str : dictionary){
                  trie.insert(str);
            }

            trie.search("him");
            trie.search("he");
      }
}
