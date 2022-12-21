// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(N) + O(N) [AUXILIARY STACK SPACE + VISITED ARRAY]

/*
 class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        List<Integer> dislikeArray[] = new List[N + 1];
        for(int i = 0; i < dislikeArray.length; i++) {
            dislikeArray[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < dislikes.length; i++) {
            dislikeArray[dislikes[i][0]].add(dislikes[i][1]);
            dislikeArray[dislikes[i][1]].add(dislikes[i][0]);
        }
        int group[] = new int[N + 1];
        Arrays.fill(group, -1);
        for(int i = 1; i <= N; i++) {
            if(group[i] == -1 && !paint(group, i, dislikeArray, 0)) {
                return false;
            }
        }
        return true;
    }
    private boolean paint(int group[], int index, List<Integer> dislikeArray[], int color) {
        group[index] = color;
        for(int i = 0; i < dislikeArray[index].size(); i++) {
            int newIndex = dislikeArray[index].get(i);
            if(group[newIndex] == color) {
                return false;
            }
            if(group[newIndex] == -1 && !paint(group, newIndex, dislikeArray, 1 - color)) {
                return false;
            }
        }
        return true;
    }
}
 */