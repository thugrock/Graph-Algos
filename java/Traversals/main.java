import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int vertex_count, data;
        BFS bfs = new BFS();
        DFS dfs = new DFS();
        ArrayList<vertex> vertexs = new ArrayList<>();
        System.out.println("Enter the number of Verticies in Graph:");
        vertex_count = in.nextInt();
        System.out.println("Verticies data will be Order from 1 to " + vertex_count + ":");

        for (int i = 0; i < vertex_count; i++) {
            vertexs.add(new vertex(i + 1));
        }
        System.out.println("Enter the Connections in Format of 'Source Destination':");
        System.out.println("Example:if Source Vertex is 1 and Destination Vertex is 2");
        System.out.println("Press '1 2' and Enter next Connection");
        System.out.println("Press -1 if Entering Connections is Done ");
        while (true) {
            int i, j;
            i = in.nextInt();
            if (i == -1) {
                break;
            } else {
                j = in.nextInt();
                vertexs.get(i - 1).addNeighbour(vertexs.get(j - 1));
            }
        }
        // For BFS
        // System.out.println("The BFS of Following Graph would be:");
        // bfs.bfs(vertexs.get(0));
        // For DFS
        // System.out.println("The DFS of Following Graph would be:");
        // dfs.dfs_iterative(vertexs.get(0));
        // dfs.dfs_rec(root);
    }
}