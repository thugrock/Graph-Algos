package maze_solver;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Maze_Solver {

    private int[][] map;
    private boolean[][] visited;
    private int start_row;
    private int start_col;
    private List<String> output;

    public Maze_Solver(int[][] map, int start_row, int start_col) {
        this.map = map;
        this.start_row = start_row;
        this.start_col = start_col;
        this.visited=new boolean[map.length][map.length];
        output=new LinkedList<>();
    }

    public void maze_solver(){

            String output=dfs(start_row,start_col);
            if(output.equals("Success")){
                System.out.println("Solution Found... and Path is ");
                printPath();
            }else{
                System.out.println("No solution is Found");
            }
    }

    public void printPath(){
        Collections.reverse(output);
        for(String path:output){
            System.out.print(path+" ");
        }
    }

    private String dfs(int row, int col){


        int endMap=this.map.length;

         if(row<0 || row>=endMap){
            return "wrong";
        }
        else if(col<0 || col>=endMap){
            return "wrong";
        }
        else if(map[row][col] == 3){
             return "Success";
         }
        else if(this.visited[row][col]){
            return "wrong";
        }
        else if(this.map[row][col]==1){
            return "wrong";
        }

        else {
            this.visited[row][col] = true;

            String down=dfs(row + 1, col);
            if (down.equals("Success") ) {
                this.output.add("Go Down ");
                return "Success";
            }

            String right=dfs(row, col + 1);
            if (right.equals("Success")) {
                this.output.add("Go Right ");
                return "Success";

            }

             String left=dfs(row, col - 1);
            if (left.equals("Success")) {
                this.output.add("Go Left ");
                return "Success";
            }

             String up=dfs(row - 1, col);
            if (up.equals("Success")) {
                this.output.add("Go Up ");
                return "Success";
            }
        }
        return "none";
    }

}
