package cycle_detection;

import java.util.ArrayList;

public class vertex {
    private int data;
    private boolean visited;
    private boolean beingVisited;
    private ArrayList<vertex> neighbourList;

    public vertex(int data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public ArrayList<vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(ArrayList<vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return "" + data;
    }

    public void addNeighbour(vertex v){
        this.neighbourList.add(v);
    }
}
