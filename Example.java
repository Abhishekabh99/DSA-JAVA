import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Graph2 {
    HashMap<Integer, List<Integer>> mymap = new HashMap<>();

    Graph2() {
        mymap = new HashMap<>();
    }

    void av(int v) {
        mymap.put(v, new ArrayList<>());
    }

    void ae(int v1, int v2) {
        mymap.get(v1).add(v2);
        mymap.get(v2).add(v1);
    }

    void gn() {
        for (int i : mymap.keySet()) {
            System.out.println("neighbours of vertex " + i + " are :" + mymap.get(i));
        }
    }

}

class Example {
    public static void main(String[] args) {
        // making object of graph class
        Graph2 mygraph = new Graph2();
        // adding vertices
        mygraph.av(1);
        mygraph.av(2);
        mygraph.av(3);
        mygraph.av(4);
        // adding edges
        mygraph.ae(1, 2);
        mygraph.ae(2, 3);
        mygraph.ae(3, 4);
        mygraph.ae(4, 1);
        // getting neighbours
        System.out.println("Neighbours below :");
        mygraph.gn();
        System.out.println("Performing dfs traversal below :");
        Set<Integer> visited = new HashSet<>();
        dfs(1, visited, mygraph);

    }

    // dfs
    public static void dfs(int v, Set<Integer> visited, Graph2 obj1) {

        visited.add(v);
        System.out.println(v + " ");
        List<Integer> list = obj1.mymap.get(v);
        for (int i : list) {
            if (!visited.contains(i)) {
                dfs(i, visited, obj1);
            }
        }

    }
}