package week8;

import java.util.LinkedList;

public class WeightedGraph {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("node-" + i + " is connected to node-" +
                            list.get(j).destination + " with weight " +  list.get(j).weight);
                }
            }
        }
    }
      public static void main(String[] args) {
            int vertices = 7;
            Graph graph = new Graph(vertices);
            graph.addEgde(1, 2, 7);
            graph.addEgde(1, 3, 2);
            graph.addEgde(1, 4, 9);
            graph.addEgde(1, 5, 3);
            graph.addEgde(1, 6, 5);
            graph.addEgde(2, 5, 4);
            graph.addEgde(3, 2, 9);
            graph.addEgde(3, 4, 4);
            graph.addEgde(3, 5, 9);
            graph.addEgde(3, 6, 4);
            graph.addEgde(5, 4, 5);
            graph.addEgde(5, 6, 1);
            graph.addEgde(6, 4, 10);
            graph.printGraph();
        }
}
