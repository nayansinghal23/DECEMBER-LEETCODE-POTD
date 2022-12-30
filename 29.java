// https://leetcode.com/problems/all-paths-from-source-to-target/

/*
 class Solution {
    public void DFS(int src, int[][] graph, List<List<Integer> > ans, List<Integer> res) {
        if(src == graph.length - 1) {
            res.add(src);
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(src);
        for(int neighbours: graph[src]) {
            DFS(neighbours, graph, ans, res);
            res.remove(res.size() - 1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer> > ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        DFS(0, graph, ans, res);
        return ans;
    }
}
 */