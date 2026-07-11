class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        
        int left = 0; 
        int right = chars.length - 1;
        
        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
    
            if (left < right) {
                swapCharacters(chars, left, right);
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }
    
    public static void swapCharacters(char[] chars, int i, int j) {
        if (chars == null || i < 0 || i >= chars.length || j < 0 || j >= chars.length) {
            return;
        }
        
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
