import java.util.*;

class Vertex {
    public int val;
    public List<Vertex> neighbors;

    public Vertex() {
        val = 0;
        neighbors = new ArrayList<Vertex>();
    }

    public Vertex(int _val, ArrayList<Vertex> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    public static void main(String[] args) {

        // creating nodes
        Vertex vertex1 = new Vertex(1, new ArrayList<>());
        Vertex vertex2 = new Vertex(2, new ArrayList<>());
        Vertex vertex3 = new Vertex(3, new ArrayList<>());
        Vertex vertex4 = new Vertex(4, new ArrayList<>());

        // adding neighbours
        vertex1.neighbors.add(vertex2);
        vertex1.neighbors.add(vertex4);
        vertex2.neighbors.add(vertex1);
        vertex2.neighbors.add(vertex3);
        vertex3.neighbors.add(vertex2);
        vertex3.neighbors.add(vertex4);
        vertex4.neighbors.add(vertex1);
        vertex4.neighbors.add(vertex3);

        // Create a collection to hold all vertices
        ArrayList<Vertex> vertices = new ArrayList<>();
        vertices.add(vertex1);
        vertices.add(vertex2);
        vertices.add(vertex3);
        vertices.add(vertex4);

        // Print neighbors of all vertices
        for (Vertex vertex : vertices) {
            System.out.println("Neighbors of Vertex " + vertex.val + ":");
            for (Vertex neighbor : vertex.neighbors) {
                System.out.println(neighbor.val);
            }
            System.out.println(); // Empty line for separation
        }

        // Depth-First Search (DFS) traversal
        System.out.println("DFS traversal:");
        boolean[] visited = new boolean[vertices.size()];
        dfs(vertex1, visited);
    }

    // Depth-First Search (DFS) method
    public static void dfs(Vertex node, boolean[] visited) {
        visited[node.val - 1] = true; // Mark current node as visited
        System.out.println("Visited: " + node.val);

        for (Vertex neighbor : node.neighbors) {
            if (!visited[neighbor.val - 1]) {
                dfs(neighbor, visited);
            }
        }
    }

}
