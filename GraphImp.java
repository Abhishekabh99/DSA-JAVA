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
}

class GraphImp {
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
    }
}
