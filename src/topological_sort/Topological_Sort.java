package topological_sort;

import bfs_dfs.traversals.DFS;
import bfs_dfs.traversals.vertex;

import java.util.Stack;

public class Topological_Sort {
    private Stack<vertex> stack;
    private DFS dfs;

    public Topological_Sort() {
        this.stack=new Stack<>();
        this.dfs=new DFS();
    }

    public void topological_sort(vertex root){
        root.setVisited(true);

        for(vertex v:root.getNeighbourList()){
            if(!v.isVisited()){
                dfs.dfs_rec(v);
            }
        }
        this.stack.add(root);
    }
    public Stack<vertex> getStack(){
        return this.stack;
    }
}
