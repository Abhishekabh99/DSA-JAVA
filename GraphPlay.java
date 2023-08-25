import java.util.*;

class Graph1 {

    private HashMap<Integer, List<Integer>> hashmap = new HashMap<>();

    Graph1() {
        hashmap = new HashMap<>();
    }

    void addV(int v) {
        hashmap.put(v, new ArrayList<>());
    }

    void addEdge(int v1, int v2) {
        hashmap.get(v1).add(v2);
        hashmap.get(v2).add(v1);
    }

    void getNeighbors() {
        for (int key : hashmap.keySet()) {
            System.out.println("neighbous of vertex " + key + " are :" + hashmap.get(key));
        }

    }

    // dfs from a starting vertex
    public void dfs(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " ");
        List<Integer> neighbourList = hashmap.get(v);
        for (int neighbour : neighbourList) {
            if (!visited.contains(neighbour)) {
                dfs(neighbour, visited);
            }

        }
    }

}

public class GraphPlay {
    public static void main(String[] args) {
        Graph1 graph = new Graph1();
        graph.addV(1);
        graph.addV(2);
        graph.addV(3);
        graph.addV(4);

        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("getting neighbours");
        graph.getNeighbors();
        System.out.println("processing dfs below");
        Set<Integer> visited = new HashSet<>();
        graph.dfs(1, visited);
        System.out.println();

    }
}
