class Solution {
    int N;
    int M;
    public int numIslands(char[][] grid) {
        N = grid.length;
        M = grid[0].length;
        boolean[][] visited = new boolean[N][M];
    int ans =0;
        for(int i =0;i<N;i++){
            for(int j =0;j<M;j++){
                if(grid[i][j] == '1'){
                    if(visited[i][j]==false){
                        ans++;
                        bfs(grid , visited , i , j);
                    }
                }
            }
        }
        return ans;
    }

    void bfs(char[][] grid,boolean[][] visited , int i , int j){
            visited[i][j] = true;
            if(i+1<N && j<M && grid[i+1][j] =='1' && visited[i+1][j]==false){
                bfs(grid,visited,i+1,j);
            }
            if(i<N && j+1<M && grid[i][j+1] =='1' && visited[i][j+1]==false){
                bfs(grid,visited,i,j+1);
            }
            if(i-1>=0 && j<M && grid[i-1][j] =='1' && visited[i-1][j]==false){
                bfs(grid,visited,i-1,j);
            }
            if(i<N && j-1>=0 && grid[i][j-1] =='1' && visited[i][j-1]==false){
                bfs(grid,visited,i,j-1);
            }
    }
}
