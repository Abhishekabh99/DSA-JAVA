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

    // bfs
    public void bfs(int v) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        visited.add(v);
        q.add(v);
        while (!q.isEmpty()) {
            int curVertex = q.poll();
            System.out.print(curVertex + " ");
            List<Integer> list = hashmap.get(curVertex);
            for (int neighbour : list) {
                if (!visited.contains(neighbour)) {
                    q.add(neighbour);
                    visited.add(neighbour);
                }
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertex around which you want to perform dfs traversal :");
        int d = sc.nextInt();
        System.out.println("processing dfs around vertex " + d + " :");
        Set<Integer> visited = new HashSet<>();
        graph.dfs(d, visited);
        System.out.println();
        System.out.println("Enter vertex around which you want to perform bfs traversal :");
        int b = sc.nextInt();
        System.out.println("processing bfs around vertex " + b);
        graph.bfs(b);

    }
}
// algo for dfs
// 1.vertex add karo visited may visited ek set of integer hoga jismay value
// repeat nhi ho sakti
// 2.vertes print karo
// 3.vertex kay neighbours ke list nikalo hashmap.get say
// 4.ab kewal recursion karna hai on condition ke visited wo neighbour contain
// na karta ho

// algo for bfs
// 1. create a set integer visited
// 2. create a queue
// 3. add the starting vertex to the queue and visisted set too.
// 4. have a while loop till queue is not empty.
// 5. poll the queue for the first element that is entered into the queue store
// it in currentVertex.
// 6. print the current vertex.
// 7. store the neighbours of currentVertex into list of integers.
// 8. loop though list of neighbours having a condition inside it which is that
// neighbour should not be in visited set.
// 9. inside condition of loop add the neighbour into the queue and into the set
// too.