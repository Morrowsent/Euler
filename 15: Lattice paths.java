public class Euler1 {
    public static void main(String[] args) {
        int gridSize = 20;
        int[][] grid = new int[gridSize][gridSize];
        printGrid(grid);
        for(int i = 0; i < gridSize; i++){
            for(int j = 0; j < gridSize; j++){

            }
        }
    }

    public static void printGrid(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            System.out.println("");
            for(int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j] + ", ");
            }
        }
    }

}
