// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(N) + O(N) [ AUXILIARY STACK SPACE + VISITED VECTOR]

/*
class Solution {
public:
    void DFS(vector<vector<int> > & adj, int source, int destination, vector<bool> & visited) {
        visited[source] = true;
        for(auto neighbours : adj[source]) {
            if(!visited[neighbours]) {
                DFS(adj, neighbours, destination, visited);
            }
        }
    }
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        vector<vector<int> > adj(n);
        for(int i = 0; i < edges.size(); i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        vector<bool> visited(n, false);
        DFS(adj, source, destination, visited);
        return visited[destination];
    }
};
*/