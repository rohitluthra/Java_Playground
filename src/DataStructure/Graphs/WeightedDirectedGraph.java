package DataStructure.Graphs;

import java.util.HashSet;
import java.util.LinkedList;

public class WeightedDirectedGraph {

    private HashSet<Vertex> nodes;

    public WeightedDirectedGraph()
    {
        this.nodes = new HashSet<>();
    }

    public void printGraph(){
        //I printed it like this. You can print it however you want though
        for(Vertex v : nodes){
            System.out.print("vertex name: "+ v.getName() + ": ");
            for(Edge e : v.getEdgesList()){
                System.out.print("destVertex: " + e.getDestination().getName() + " weight: " + e.getWeight() + " | ");
            }
            System.out.print("\n");
        }
    }

    public void addVertex(Vertex v1)
    {
        this.nodes.add(v1);
    }

    public void addEdge(Vertex v1, Vertex v2, int weight)
    {
        v1.getEdgesList().add(new Edge(weight, v2));
    }

}

class Edge{
    private int weight;
    private Vertex destination;

    public Edge(int weight, Vertex v)
    {
        this.weight = weight;
        this.destination = v;
    }

    // This can be useful when we have unweighted graph situation
    public Edge(Vertex c)
    {
        this.destination = c;
        this.weight = 1;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getDestination() {
        return destination;
    }

}

class Vertex{

    private LinkedList<Edge> edgesList;
    private String name;

    public Vertex(String name){
        this.name = name;
        this.edgesList = new LinkedList<>();
    }
    public String getName(){
        return  this.name;
    }

    public LinkedList<Edge> getEdgesList()
    {
        return this.edgesList;
    }

}

class Demo{
    public static void main(String[] args) {
        WeightedDirectedGraph ourGraph = new WeightedDirectedGraph();

        //vertices
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");

        ourGraph.addVertex(v0);
        ourGraph.addVertex(v1);
        ourGraph.addVertex(v2);
        ourGraph.addVertex(v3);

        //edges
        ourGraph.addEdge(v0, v1, 2);
        ourGraph.addEdge(v1, v2, 3);
        ourGraph.addEdge(v2, v0, 1);
        ourGraph.addEdge(v2, v3, 1);
        ourGraph.addEdge(v3, v2, 4);

        ourGraph.printGraph();
    }
}