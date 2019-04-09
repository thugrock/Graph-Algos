package bfs_dfs.application;

import bfs_dfs.traversals.BFS;
import bfs_dfs.traversals.vertex;
import bfs_dfs.traversals.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class application {
    public static  Scanner in = new Scanner(System.in);


    public static ArrayList<vertex> vertexInput(){
        int vertex_count;
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
        return vertexs;
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        DFS dfs = new DFS();
        ArrayList<vertex> vertexs=vertexInput();
        // For BFS
        System.out.println("The BFS of Following Graph would be:");
        bfs.bfs(vertexs.get(0));

        //Formatting and setting for further use
        System.out.println("");
        for(vertex v: vertexs){
            v.setVisited(false);
        }

        // For DFS Iterative
        System.out.println("The Iterative DFS of Following Graph would be:");
        dfs.dfs_iterative(vertexs.get(0));

        //Formatting and setting for further use
        System.out.println("");
        for(vertex v: vertexs){
            v.setVisited(false);
        }

        //For DFS Recursive
        System.out.println("The Recursive DFS of Following Graph would be:");
        dfs.dfs_rec(vertexs.get(0));
    }
}
