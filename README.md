# Graphs
# Edge
getSource() returns the source vertex of the edge.
getDestination() returns the destination vertex of the edge.
getWeight() returns the weight of the edge.
These getter methods allow to access the private instance variables of the Edge class from outside the class.

# Vertex
The getData() method is a getter that returns the data associated with the vertex.

The addAdjacentVertex(Vertex<V> destination, double weight) method is used to add an adjacent vertex to the current vertex, along with the weight or cost associated with the edge connecting them. It takes in two parameters: destination (representing the adjacent vertex) and weight (representing the weight or cost of the edge). The method adds this information to the adjacentVertices map, where the adjacent vertex is the key, and the weight is the value.

The getAdjacentVertices() method returns the map of adjacent vertices and their associated weights. This allows you to retrieve the adjacent vertices and their weights for a particular vertex.

The toString() method overrides the default toString() method of the Object class. It returns a string representation of the data associated with the vertex. This can be useful for printing or displaying the vertex's data.

  # WeightedGraph
  

The type parameter <Vertex> indicates that the class can work with any type of vertex object. This allows you to create graphs with vertices of different types, as long as they are consistent within a particular instance of the WeightedGraph class.

The adjacencyList is a map that associates each vertex with a list of Edge objects. Each vertex is used as a key, and the value is a list of edges associated with that vertex.

The WeightedGraph constructor initializes the adjacencyList as a new HashMap. The addVertex(Vertex vertex) method adds a vertex to the graph by putting it into the adjacencyList map with an empty list of edges.

The addEdge(Vertex source, Vertex destination, int weight) method adds an edge between the source vertex and the destination vertex, with the specified weight. It first validates that both the source and destination vertices are in the graph by calling the validateVertex(Vertex vertex) method. Then, it creates a new Edge object with the given parameters and adds it to the list of edges associated with the source vertex in the adjacencyList map.

The validateVertex(Vertex vertex) method checks if a given vertex is in the graph by verifying if it exists as a key in the adjacencyList map. If the vertex is not found, an IllegalArgumentException is thrown with an error message.

The getAdjacentEdges(Vertex vertex) method retrieves the list of edges associated with a given vertex in the adjacencyList map. It first validates the vertex and then returns the corresponding list of edges.

The getVertices() method returns a Set containing all the vertices in the graph. It retrieves the key set from the adjacencyList map.
