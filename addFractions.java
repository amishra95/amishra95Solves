class Solution {
    public String addFractions(String frac1, String frac2) {

        String[] first = frac1.split("/");
        int num1 = Integer.parseInt(first[0]);
        int dem1 = Integer.parseInt(first[1]);

        String[] second = frac2.split("/");
        int num2 = Integer.parseInt(second[0]);
        int dem2 = Integer.parseInt(second[1]);

        int a = num1*dem2;
        int b = num2*dem1;
        int c = dem1*dem2;

        int numSum = (a+b);

        for(int i = 2; i <= Math.min(Math.abs(numSum),c); i++){
            while(numSum %i  == 0 && c%i == 0){
                numSum /= i;
                c /= i;
            }
        }

        return numSum + "/"+ c;
    
        
        




     }

     

     
}
