package cycle_detection;

import java.util.ArrayList;

public class Cycle_Detection {

    private int count=0;

    public void detectCycle(ArrayList<vertex> vertexs)
    {
        for(vertex v: vertexs){
            if(!v.isVisited()) {
                cycle_detection(v);
            }
        }
    }

    public void cycle_detection(vertex root){

        root.setVisited(false);
        root.setBeingVisited(true);

        for(vertex v:root.getNeighbourList()){
            if(v.isBeingVisited()){
                System.out.println("Backward loop detected at "+v+" ...Cycle is Detected");
                count++;
                return;
            }
            if(!v.isVisited()){
                cycle_detection(v);
            }
        }
        root.setVisited(true);
        root.setBeingVisited(false);
    }

    public int getCount() {
        return count;
    }
}
