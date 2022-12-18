// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(N)

/*
 class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            ans[i] = 0;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = temperatures.length - 1; i >= 0; i--) {
            boolean check = false;
            while(!st.empty() && temperatures[st.peek()] <= temperatures[i]) {
                check = true;
                st.pop();
            }
            if(st.empty()) {
                ans[i] = 0;
            }
            else if(!st.empty() && !check && temperatures[st.peek()] > temperatures[i]) {
                ans[i] = 1;
            }
            else {
                ans[i] = Math.abs(st.peek() - i);
            }
            st.push(i);
        }
        return ans;
    }
}
 */