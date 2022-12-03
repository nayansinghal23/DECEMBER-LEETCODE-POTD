/*
POINTS TO BE NOTED

1) If both the given strings are of different length then answer will always be false.
2) If any character of string1 is not present in string2 or any character of string2 is not present in string1 then also answer will be false.
3) If the frequencies of string1 vary with the frequencies of string2 then also answer will be false.
*/


// TIME COMPLEXITY :- O(N)
// SPACE COMPLEXITY :- O(N)


/*
class Solution {
public:
    bool solve(string word1, int w1, string word2, int w2) {
        map<char, int> s1;
        map<char, int> s2;
        for(int i = 0; i < w1; i++) {
            s1[word1[i]]++;
            s2[word2[i]]++;
        }
        for(int i = 0; i < w2; i++) {
            if(s1.find(word2[i]) == s1.end() || s2.find(word1[i]) == s2.end()) {
                return false;
            }
        }
        map<int, int> m;
        for(auto itr = s1.begin(); itr != s1.end(); itr++) {
            int x = itr->second;
            m[x]++;
        }
        for(auto itr = s2.begin(); itr != s2.end(); itr++) {
            if(m[itr->second] != 0) {
                m[itr->second]--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    bool closeStrings(string word1, string word2) {
        int w1 = word1.size();
        int w2 = word2.size();
        if(w1 != w2) {
            return false;
        }
        return solve(word1, w1, word2, w2);
    }
};
*/
