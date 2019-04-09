package maze_solver;

import java.io.File;
import java.util.Scanner;

public class File_Parser {

    private String file_name;
    private int map[][];
    private int number_of_rows;
    private int number_of_cols;
    private int starting_row_pos;
    private int starting_col_pos;

    public File_Parser(String file_name, int number_of_rows, int number_of_cols) {
        this.file_name = file_name;
        this.number_of_rows = number_of_rows;
        this.number_of_cols = number_of_cols;
        this.map=new int[number_of_rows][number_of_cols];

    }

    public void file_parser(){

        try {
            Scanner scanner=new Scanner(new File(this.file_name));

            for(int i=0;i<number_of_rows;i++){
                for(int j=0;j<number_of_cols;j++){

                    map[i][j]=scanner.nextInt();

                    if(map[i][j]==2){
                        starting_row_pos=i;
                        starting_col_pos=j;
                    }
                }
            }
            scanner.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public int[][] getMap() {
        return map;
    }

    public int getNumber_of_rows() {
        return number_of_rows;
    }

    public int getNumber_of_cols() {
        return number_of_cols;
    }

    public int getStarting_row_pos() {
        return starting_row_pos;
    }

    public int getStarting_col_pos() {
        return starting_col_pos;
    }
}
