package topological_sort;

import bfs_dfs.traversals.vertex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        int vertex_count;
        ArrayList<vertex> vertexs = new ArrayList<>();

        Topological_Sort topological_sort=new Topological_Sort();

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

        topological_sort.topological_sort(vertexs.get(0));
        Stack<vertex> stack=topological_sort.getStack();
        for(vertex v:stack){
            System.out.print(v+" ");
        }

    }
}
