import java.util.*;

class GraphClass2 {
    int v;
    LinkedList<Integer>[] ll;

    public GraphClass2(int v) {
        this.v = v;
        ll = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            ll[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        ll[source].add(destination);
        // If the graph is undirected, you can add the reverse edge as well
        // adjacencyList[destination].add(source);
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int neighbor : ll[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class GraphImpLL {
    public static void main(String[] args) {
        int numVertices = 5;
        GraphClass2 graph = new GraphClass2(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.printGraph();
    }
}
