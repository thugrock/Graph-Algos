package bfs_dfs.traversals;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public BFS() {

    }

    public void bfs(vertex root) {
        Queue<vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            vertex actualVertex = queue.remove();
            System.out.print(actualVertex + " ");
            for (vertex v : actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }

    }

}
