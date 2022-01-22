import java.util.ArrayList;
import java.util.Scanner;


//for unweighted Graph
public class Graph_Representation_Adj_list {
      public static class Graph_{
            public static class Edge{
                  int src;
                  int dest;
                  Edge(int src, int dest){
                        this.src = src;
                        this.dest = dest;
                  }
            }

            static ArrayList<ArrayList<Edge>> adj;
            static int size;
            Graph_(int nodes){
                  this.size = nodes;
                  adj = new ArrayList<> ();
                  for(int i = 0; i < size; i++){
                        adj.add(new ArrayList<> ());
                  }
            }

            private static void add_directed_edge(int src, int dest){
                  Edge edge = new Edge (src, dest);
                  adj.get(src).add( edge );
            }
            private static void add_undirected_edge(int src, int dest){
                  add_directed_edge (src, dest);
                  add_directed_edge (dest, src);
            }
            private static void display_graph(){
                  int nodes = size;
                  for(int i = 0; i < nodes; i++){
                        System.out.print("src : "+ i + " : -> ");
                        for(Edge edge : adj.get(i)){
                              System.out.print( edge.dest + " , ");
                        }
                        System.out.println();
                  }
                  System.out.println();
            }
      }

      public static void main(String[] args){
            Scanner scan = new Scanner (System.in);


            Graph_ graph = new Graph_ (6);

            graph.add_undirected_edge (0,3);
            graph.add_undirected_edge (0,1);
            graph.add_undirected_edge (1,2);
            graph.add_undirected_edge (2,3);
            graph.add_undirected_edge (3,4);
            graph.add_undirected_edge (4,5);
            graph.add_undirected_edge (3,5);

            graph.display_graph ();


      }

}
