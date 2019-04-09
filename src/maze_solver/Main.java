package maze_solver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Path of text file:");
        String file_name=in.nextLine();
        System.out.println("Enter the Number of Rows in Maze:");
        int number_of_rows=in.nextInt();
        System.out.println("Enter the Number of Columns in Maze:");
        int number_of_cols=in.nextInt();
        File_Parser parser=new File_Parser(file_name,number_of_rows,number_of_cols);
        parser.file_parser();

        Maze_Solver maze_solver=new Maze_Solver(parser.getMap(),parser.getStarting_row_pos(),parser.getStarting_col_pos());
        maze_solver.maze_solver();
    }
}
