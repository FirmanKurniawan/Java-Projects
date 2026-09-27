import java.util.*;
public class Bfs {
    // this is graph class to create a graph
    class Graph{
        public HashMap<Integer,ArrayList<Integer>> adjList = new HashMap<>();

        public void addEdge(int n1,int n2){
            if(!adjList.containsKey(n1)){
                adjList.put(n1,new ArrayList<>());
            }
            adjList.get(n1).add(n2);
            if(!adjList.containsKey(n2)){
                adjList.put(n2,new ArrayList<>());
            }
            adjList.get(n2).add(n1);
        }
    }

    // method to implement bfs algorithm
    private static void bfs(int src,Graph g){
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();
        q.add(src);
        visited.put(src,true);
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");
            for(int nbr : g.adjList.get(node)){
                if(!visited.containsKey(nbr) || !visited.get(nbr)){
                    q.add(nbr);
                    visited.put(nbr,true);
                }
            }
        }
    }
    
    // main method to create a graph
    public static void main(String[] args) {
        Graph graph = new Bfs().new Graph();

        //adding nodes
        // can be edited according to user
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 8);
        graph.addEdge(3, 5);
        graph.addEdge(5, 4);
        graph.addEdge(3, 4);

        // using bfs
        bfs(1,graph);

    }
}
