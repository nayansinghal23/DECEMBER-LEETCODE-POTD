/*
POINTS TO BE NOTED :-

1) Firstly store all the frequencies in unordered_map.
2) Copy the pair (frequency, character) in a vector.
3) Sort the vector.
4) Create an answer string and store all characters according to their frequencies.
5) Reverse the answer string.
*/

// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY : O(N)

/*
class Solution {
public:
    string frequencySort(string s) {
        int n = s.size();
        unordered_map<char, int> mp;
        for(int i = 0; i < n; i++) {
            mp[s[i]]++;
        }
        vector<pair<int,char> > v;
        for(auto itr : mp) {
            v.push_back({itr.second, itr.first});
        }
        sort(v.begin(), v.end());
        string ans = "";
        for(auto itr : v) {
            while(itr.first != 0) {
                ans.push_back(itr.second);
                itr.first--;
            }
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};
*/