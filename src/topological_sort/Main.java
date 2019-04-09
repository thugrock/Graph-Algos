package topological_sort;

import bfs_dfs.traversals.vertex;
import bfs_dfs.application.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        Topological_Sort topological_sort=new Topological_Sort();

        ArrayList<vertex> vertexs = application.vertexInput();

        topological_sort.topological_sort(vertexs.get(0));

        Stack<vertex> stack=topological_sort.getStack();

        for(vertex v:stack){
            System.out.print(v+" ");
        }

    }
}
