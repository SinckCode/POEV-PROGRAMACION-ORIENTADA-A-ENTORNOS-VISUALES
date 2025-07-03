import java.util.*;

// Clase para representar un grafo no dirigido utilizando un mapa de adyacencia
class Graph {
    private Map<Character, Set<Character>> adj; // Mapa de adyacencia

    // Constructor
    Graph(Map<Character, Set<Character>> adjacencyList) {
        adj = adjacencyList;
    }

    // Método para recorrido BFS desde un vértice dado
    void BFS(Character start) {
        // Marcar todos los vértices como no visitados
        Set<Character> visited = new HashSet<>();

        // Crear una cola para el BFS
        Queue<Character> queue = new LinkedList<>();

        // Marcar el vértice actual como visitado y agregarlo a la cola
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            // Sacar un vértice de la cola e imprimirlo
            Character current = queue.poll();
            System.out.print(current + " ");

            // Obtener todos los vértices adyacentes del vértice sacado
            // Si un adyacente no ha sido visitado, marcarlo como visitado y agregarlo a la cola
            for (Character neighbor : adj.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    // Método para recorrido DFS desde un vértice dado
    void DFS(Character start) {
        // Marcar todos los vértices como no visitados
        Set<Character> visited = new HashSet<>();

        // Llamar a la función DFSUtil para imprimir el recorrido DFS
        DFSUtil(start, visited);
    }

    // Método utilitario para DFS
    void DFSUtil(Character current, Set<Character> visited) {
        // Marcar el vértice actual como visitado y imprimirlo
        visited.add(current);
        System.out.print(current + " ");

        // Recorrer todos los vértices adyacentes al vértice actual
        for (Character neighbor : adj.get(current)) {
            // Si un vértice adyacente no ha sido visitado, llamar recursivamente a DFSUtil para él
            if (!visited.contains(neighbor)) {
                DFSUtil(neighbor, visited);
            }
        }
    }
}

// Clase principal
public class DFSyBFS {
    public static void main(String args[]) {
        // Crear el grafo con los datos proporcionados
        Map<Character, Set<Character>> graph = new HashMap<>();
        graph.put('A', new HashSet<>(Arrays.asList('B', 'C')));
        graph.put('B', new HashSet<>(Arrays.asList('A', 'D', 'E')));
        graph.put('C', new HashSet<>(Arrays.asList('A', 'F')));
        graph.put('D', new HashSet<>(Collections.singletonList('B')));
        graph.put('E', new HashSet<>(Arrays.asList('B')));
        graph.put('F', new HashSet<>(Collections.singletonList('C')));

        // Crear una instancia de la clase Graph
        Graph g = new Graph(graph);

        System.out.println("BFS comenzando desde el vertice A:");
        g.BFS('A');
        System.out.println("\nDFS comenzando desde el vertice A:");
        g.DFS('A');
    }
}
