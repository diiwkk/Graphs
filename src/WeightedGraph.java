import java.util.*;

public class WeightedGraph<Vertex> {
    private Map<Vertex, List<Edge<Vertex>>> adjacencyList;

    public WeightedGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(Vertex vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }
    public void addEdge(Vertex source, Vertex destination, int weight) {
        validateVertex(source);
        validateVertex(destination);

        Edge<Vertex> edge = new Edge<>(source, destination, weight);
        adjacencyList.get(source).add(edge);

    }
}