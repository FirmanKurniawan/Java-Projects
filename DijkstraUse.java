import java.util.*;

import javax.swing.text.html.ParagraphView;
class Pair{
    Integer num;
    int dist;
    public Pair(Integer n,int d){
        num = n;
        dist = d;
    }
}
public class DijkstraUse {

    HashMap<Integer,ArrayList<Pair>> adjMat = new HashMap<>();

    public void addEdges(Integer x,Integer y,boolean bidir,int dist){
        if(adjMat.get(x)==null) adjMat.put(x,new ArrayList<>());
        adjMat.get(x).add(new Pair(y, dist));
        if(bidir){
            if(adjMat.get(y)==null) adjMat.put(y,new ArrayList<>());
            adjMat.get(y).add(new Pair(x,dist));
        }
    }
    public void addVertice(Integer x){
        adjMat.put(x, new ArrayList<>());
    }

    public void dijkstra(Integer src){
        HashMap<Integer,Integer> distance = new HashMap<>();
        TreeSet<Pair> set = new TreeSet<>(new Comparator<Pair>() {
            public int compare(Pair a, Pair b){
                if(a.dist>b.dist) return 1;
                return -1;
            }
        });

        for(Map.Entry<Integer,ArrayList<Pair>> entry : adjMat.entrySet()){
            distance.put(entry.getKey(),Integer.MAX_VALUE);
        }

        distance.put(src,0);
        set.add(new Pair(src,0));

        while(!set.isEmpty()){
            // this is the just the ground work for the loop to kick off
            Pair node = set.pollFirst();
            // loop to change each pair of set
            for(Pair childPair : adjMat.get(node.num)){
                int dFromNode = node.dist + childPair.dist;
                if(dFromNode < distance.get(childPair.num)){
                    //remove from set to update its value in the set
                    set.remove(new Pair(childPair.num, childPair.dist));
                    // adding to set to complete updata
                    set.add(new Pair(childPair.num,dFromNode));
                    // updating the distance hashmap
                    distance.put(childPair.num,dFromNode);
                }
            }
        }

        // printing dist 
        for(Map.Entry<Integer,Integer> entry : distance.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        DijkstraUse graph = new DijkstraUse();
        graph.addEdges(1, 2, true, 1);
        graph.addEdges(1, 3, true, 4);
        graph.addEdges(1, 4, true, 7);
        graph.addEdges(2, 3, true, 1);
        graph.addEdges(4, 3, true, 2);

        graph.dijkstra(1);
    }
}
