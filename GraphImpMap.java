//algo Graph 
//1.graph class hoga uske andar map hoga integer and list of integers key value pair ka 
//2.contructor hoga class ka jo hamesha naya map bana dega 
//3.add vertex method hoga jo map may values put karega key ke jagah vertex jo fucntion kay parameter say ayega or value ke jagah naya array list create kar denagy us key kay liye
//4.add edge hoga jo 2 parameter accept karega (2 vertex) ek vertex key hoga or dusra jo us ke valuie banega map may
//5.add a method to get all the connected vertices from a particular vertex 
//5map may ek key kay jitne values hongay wo saray values uss key say connected honagy esa maan lo as a graph

import java.util.*;

class GraphClass {

    HashMap<Integer, List<Integer>> hashmap = new HashMap<>();

    // we should not generate constructor we should manually make it where no
    // parameter required
    GraphClass() {
        hashmap = new HashMap<>();
    }

    void addVertex(int v) {
        hashmap.put(v, new ArrayList<Integer>());
    }

    void addEdge(int v1, int v2) {
        // doing it for both side as it is undirected graph
        hashmap.get(v1).add(v2);
        hashmap.get(v2).add(v1);
    }

    List<Integer> getConnectedVertices(int v) {
        return hashmap.get(v);
    }

    // DFS traversal
    void dfs(int startVertex, Set<Integer> visited) {
        visited.add(startVertex);
        System.out.print(startVertex + " ");

        List<Integer> connectedVertices = hashmap.get(startVertex);
        for (int vertex : connectedVertices) {
            if (!visited.contains(vertex)) {
                dfs(vertex, visited);
            }
        }
    }

    // bfs traversal
    void bfs(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            List<Integer> connectedVertices = hashmap.get(currentVertex);
            for (int vertex : connectedVertices) {
                if (!visited.contains(vertex)) {
                    queue.add(vertex);
                    visited.add(vertex);
                }
            }
        }
    }
}

class GraphImpMap {
    public static void main(String[] args) {
        GraphClass graph = new GraphClass();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        System.out.println("Adjacent vertices of vertex 1: " + graph.getConnectedVertices(1));
        System.out.println("Adjacent vertices of vertex 2: " + graph.getConnectedVertices(2));
        // Performing dfs starting from vertex 1
        System.out.print("DFS traversal starting from vertex 1: ");
        Set<Integer> visited = new HashSet<>();
        graph.dfs(1, visited);
        // Perform BFS traversal starting from vertex 1
        System.out.println();
        System.out.print("BFS traversal starting from vertex 1: ");
        graph.bfs(1);
    }

}

// public class GraphUsingMap {
// private Map<Integer, List<Integer>> adjacencyList;

// public GraphUsingMap() {
// adjacencyList = new HashMap<>();
// }

// public void addEdge(int source, int destination) {
// adjacencyList.computeIfAbsent(source, k -> new
// ArrayList<>()).add(destination);
// // If the graph is undirected, you can add the reverse edge as well
// // adjacencyList.computeIfAbsent(destination, k -> new
// ArrayList<>()).add(source);
// }

// public List<Integer> getNeighbors(int node) {
// return adjacencyList.getOrDefault(node, new ArrayList<>());
// }

// public static void main(String[] args) {
// GraphUsingMap graph = new GraphUsingMap();

// graph.addEdge(0, 1);
// graph.addEdge(0, 2);
// graph.addEdge(1, 3);
// graph.addEdge(2, 4);
// graph.addEdge(3, 5);

// System.out.println("Neighbors of node 0: " + graph.getNeighbors(0));
// System.out.println("Neighbors of node 1: " + graph.getNeighbors(1));
// }
// }
// In this example, the GraphUsingMap class maintains a Map<Integer,
// List<Integer>> to represent the adjacency list. The addEdge method adds edges
// to the graph, and the getNeighbors method retrieves the neighbors of a given
// node.

// Compile and run the GraphUsingMap class. It demonstrates how to create a
// graph, add edges, and retrieve neighbors using the Map data structure. You
// can modify the graph structure by adding more edges or vertices and exploring
// different functionalities based on your requirements.
