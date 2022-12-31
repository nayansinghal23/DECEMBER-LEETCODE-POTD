// https://leetcode.com/problems/unique-paths-iii/

/*
 class Solution {
    public boolean allSquaresVisited(boolean[][] visited, int[][] grid) {
        for(int i = 0; i < visited.length; i++) {
            for(int j = 0; j < visited[0].length; j++) {
                if(visited[i][j] == false && grid[i][j] != -1) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(int i, int j, int m, int n, boolean[][] visited, int[][] grid) {
        if(i < 0 || i >= m || j < 0 || j >= n) {
            return false;
        }
        if(visited[i][j] || grid[i][j] == -1) {
            return false;
        }
        return true;
    }
    public int f(int[][] grid, int m, int n, int si, int sj, int ei, int ej, boolean[][] visited) {
        if(si == ei && sj == ej) {
            visited[si][sj] = true;
            if(allSquaresVisited(visited, grid)) {
                visited[si][sj] = false;
                return 1;
            }
            visited[si][sj] = false;
            return 0;
        }
        int left = 0, right = 0, top = 0, bottom = 0;
        if(isSafe(si, sj + 1, m, n, visited, grid)) {
            visited[si][sj] = true;
            right = f(grid, m, n, si, sj + 1, ei, ej, visited);
            visited[si][sj] = false;
        }
        if(isSafe(si, sj - 1, m, n, visited, grid)) {
            visited[si][sj] = true;
            left = f(grid, m, n, si, sj - 1, ei, ej, visited);
            visited[si][sj] = false;
        }
        if(isSafe(si + 1, sj, m, n, visited, grid)) {
            visited[si][sj] = true;
            bottom = f(grid, m, n, si + 1, sj, ei, ej, visited);
            visited[si][sj] = false;
        }
        if(isSafe(si - 1, sj, m, n, visited, grid)) {
            visited[si][sj] = true;
            top = f(grid, m, n, si - 1, sj, ei, ej, visited);
            visited[si][sj] = false;
        }
        return left + right + top + bottom;
    }
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int si = -1, sj = -1, ei = -1, ej = -1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    si = i;
                    sj = j;
                }
                else if(grid[i][j] == 2) {
                    ei = i;
                    ej = j;
                }
            }
        }
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                visited[i][j] = false;
            }
        }
        return f(grid, m, n, si, sj, ei, ej, visited);
    }
}
 */