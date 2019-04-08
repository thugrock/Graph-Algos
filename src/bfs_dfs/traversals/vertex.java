package bfs_dfs.traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class vertex {
    private int data;
    private boolean visited;
    private List<vertex> neighbourList;

    public vertex(int data) {
        this.data = data;
        this.visited = false;
        this.neighbourList = new ArrayList<>();
    }

    // Is Visted For booleans
    public boolean isVisited() {
        return this.visited;
    }

    // Getters
    public int getData() {
        return this.data;
    }

    public boolean getVisited() {
        return this.visited;
    }

    public List<vertex> getNeighbourList() {
        return this.neighbourList;
    }

    // Setters
    public void setData(int data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourList(List<vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    // return Vertex if Paremeters Satisfied
    public vertex data(int data) {
        this.data = data;
        return this;
    }

    public vertex visited(boolean visited) {
        this.visited = visited;
        return this;
    }

    public vertex neighbourList(List<vertex> neighbourList) {
        this.neighbourList = neighbourList;
        return this;
    }

    public vertex(int data, boolean visited) {
        this.data = data;
        this.visited = visited;
    }

    public void addNeighbour(vertex v) {
        this.neighbourList.add(v);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof vertex)) {
            return false;
        }
        vertex vertex = (vertex) o;
        return data == vertex.data && visited == vertex.visited;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, visited) + 30;
    }

    @Override
    public String toString() {
        return "" + data;
    }

}
