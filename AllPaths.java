//in this questions there is a maze and we need to find all the possible paths to reach to the last point
//and we need to print the direction and the actual path.
//this is a recursion and backtracking question.

package recursion;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPath("",board,0,0,path, 1);
    }

    private static void allPath(String p, boolean[][] maze, int r, int c,int[][] path, int step) {
        //base condition
        if (r==maze.length-1 && c==maze[0].length-1) {
            path[r][c] = step;
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r< maze.length-1) {
            allPath(p+'D', maze,r+1, c, path, step+1);
        }
        if(c< maze[0].length-1) {
            allPath(p+'R', maze, r, c+1, path, step+1);
        }
        if(r>0) {
            allPath(p+'U', maze, r-1, c, path, step+1);
        }
        if(c>0) {
            allPath(p+'L', maze, r, c-1, path, step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
