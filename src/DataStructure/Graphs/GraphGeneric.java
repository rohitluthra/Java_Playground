package DataStructure.Graphs;

import java.util.*;

public class GraphGeneric<T> {

    // Used map to store edges in the graph
    private Map<T, List<T>> graph = new HashMap<>();




    public void addVertex(T s)
    {
        this.graph.put(s, new LinkedList<T>());
    }

    List <Integer> map = new ArrayList<Integer>();

    public void addEdge(T s1, T s2, boolean bidirectional)
    {
        if (!this.graph.containsKey(s1))
            this.addVertex(s1);

        if (!this.graph.containsKey(s2))
            this.addVertex(s2);

        this.graph.get(s1).add(s2);

        if (bidirectional)
            this.graph.get(s2).add(s1);
    }

    public void getEdgesCount(boolean bidirectional)
    {
        int count = 0;
        for (T s: this.graph.keySet())
        {
            count+= this.graph.get(s).size();
        }
        if (bidirectional)
        {
            count = count / 2 ;
        }
        System.out.println("Edges count = " + count);
    }

    public void hasVertex(T s)
    {
        if (this.graph.containsKey(s)){
            System.out.println("Contains Vertex");
        }
        else{
            System.out.println("Does not contains vertex");
        }
    }

    public void hasEdge (T s1, T s2)
    {
        if (this.graph.containsKey(s1) && this.graph.containsKey(s2))
        {
            if (this.graph.get(s1).contains(s2))
            {
                System.out.println("Two vertex have an edge");
            }
        }
        else
        {
            System.out.println("One of the key does not exist");
        }
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : this.graph.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : this.graph.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }

    // This function gives the count of vertices
    public void getVertexCount()
    {
        System.out.println("The graph has "
                + this.graph.keySet().size()
                + " vertex");
    }

}

class demo{
    public static class Main {

        public static void main(String args[])
        {

            // Object of graph is created.
            GraphGeneric<Integer> g = new GraphGeneric<>();

            // edges are added.
            // Since the graph is bidirectional,
            // so boolean bidirectional is passed as true.
            g.addEdge(0, 1, true);
            g.addEdge(0, 4, true);
            g.addEdge(1, 2, true);
            g.addEdge(1, 3, true);
            g.addEdge(1, 4, true);
            g.addEdge(2, 3, true);
            g.addEdge(3, 4, true);

            // print the graph.
            System.out.println("Graph:\n"
                    + g.toString());

            // gives the no of vertices in the graph.
            g.getVertexCount();

            // gives the no of edges in the graph.
            g.getEdgesCount(true);

            // tells whether the edge is present or not.
            g.hasEdge(3, 4);

            // tells whether vertex is present or not
            g.hasVertex(5);
        }
    }
}
