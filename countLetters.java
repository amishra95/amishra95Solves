class Solution {
    public int countLetters(String S) {
    
    int count = 0;

    for(int i = 0; i < S.length(); i++){
        char curr = S.charAt(i);
        for(int j = i; j < S.length(); j++){
            if(S.charAt(j) != curr) break;
            count++;
        }

    }

        return count;

    }
}
