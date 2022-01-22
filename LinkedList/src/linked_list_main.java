import java.util.Scanner;

public class linked_list_main {

      public static void main(String[] args){
            Scanner scan = new Scanner (System.in);

            Linked_list_  list = new Linked_list_ ();
            //add head
            list.add_at_head (10);
            list.add_at_head(20);
            list.add_at_head(30);
            list.add_at_head(40);
            list.display_list();

            //add tail
            list.add_at_tail(50);
            list.add_at_tail(60);
            list.display_list();

            //delete head
            list.delete_from_front ();
            list.display_list();

            //delete last
            list.delete_from_last();
            list.display_list();

            //remove specific node
            list.remove_value_node(10);
            list.display_list();

            list.add_at_head(20);
            list.add_at_head(20);
            list.add_at_head(20);
            list.add_at_head(30);
            list.display_list();

            list.remove_value_node(20);
            list.display_list();






      }
}
