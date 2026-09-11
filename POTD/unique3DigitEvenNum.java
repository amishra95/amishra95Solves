class Solution {
    public int totalNumbers(int[] digits) {
        if(digits == null || digits.length == 0){
            return 0;
        }

    int[] freq = new int[10];
    for(int d : digits){
        freq[d]++;
    }
    
    int count = 0;

    for(int i = 100; i < 1000; i += 2){
        int hundred = i/100;
        int ten = (i/10)%10;
        int one = i%10;
        
        int[] needed = new int[10];
        needed[hundred]++;
        needed[ten]++;
        needed[one]++;

        boolean valid = true;
        for (int d = 0; d <= 9; d++) {
                if (needed[d] > freq[d]) {
                    valid = false;
                    break; 
                }
            }
            if(valid){
                count++;
            }

    }
    return count;
        
    }
}
