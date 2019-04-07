import java.util.*;
import java.lang.*;

public class DFS {

    public DFS() {
    }

    public void dfs_rec(vertex root) {
        root.setVisited(true);
        System.out.print(root + " ");
        for (vertex v : root.getNeighbourList()) {
            if (!v.isVisited()) {
                dfs_rec(v);
            }
        }
    }

    public void dfs_iterative(vertex root) {
        Stack<vertex> stack = new Stack<>();
        root.setVisited(true);
        stack.add(root);
        while (!stack.isEmpty()) {
            vertex actualvertex = stack.pop();
            System.out.print(actualvertex + " ");

            for (vertex v : actualvertex.getNeighbourList()) {

                if (!v.isVisited()) {
                    stack.add(v);
                }
            }
        }
    }
}