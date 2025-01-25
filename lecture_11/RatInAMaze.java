package lecture_11;

public class RatInAMaze {
    static int[][] ans= new int[100][100];
    static int count=1;
    static void display(int x , int y){
        for(int i=0;i<=x;i++){
            for (int j=0;j<=y;j++)
            System.out.print(ans[i][j]+"    ");
            System.out.println();
            System.out.println();
        }
    }
    static boolean findCheese(int[][]maze , int i, int j, int x, int y ){
        if(i==x && j==y){
            ans[i][j]=count;
            return true;
        }
        if(j>=0 &&  i<maze.length && j<maze[0].length  && maze[i][j]==0 && ans[i][j]==0){
            ans[i][j]=count++;
            // Move up diagonal
            if (findCheese(maze, i - 1, j-1, x, y)) 
            return true;
            //move down
            if(findCheese(maze, i+1, j, x, y))
            return true;
            //move right
            if(findCheese(maze, i, j+1, x, y))
            return true;
            //move left
            if(findCheese(maze, i, j-1, x, y))
            return true;
            // Move up
            if (findCheese(maze, i - 1, j, x, y)) 
            return true;
            ans[i][j]=0; //backtracking
            count --;
            System.out.println("*");

        }
        
            return false;
    }
    public static void main(String[] args) {
        int[][] maze = {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
    };
    int x=2,y=0; //pos of cheeze 
    int i=3,j=3; //pos of mouse 
    findCheese(maze, i, j, x, y);
     display(maze.length-1,maze[0].length-1);
    }
}
