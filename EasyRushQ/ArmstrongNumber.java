class Solution {
    public boolean isArmstrong(int N) {

        List<Integer> list = new ArrayList<>();
        int temp = N; 

        while (temp > 0) {
            list.add(temp % 10); 
            temp /= 10;
        }

        int n = list.size();
        int sum = 0; 

        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(list.get(i), n); 
        }

        return sum == N; 
    }
}
