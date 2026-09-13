class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length; 
        int m = img1[0].length; 

      List<int[]> l1 = new ArrayList<>();
      List<int[]> l2 = new ArrayList<>();
        
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(img1[i][j] == 1){
                l1.add(new int[]{i, j});
            }
            if(img2[i][j] == 1){
                l2.add(new int[]{i, j});
            }
        }
    }
    
    Map<List<Integer>, Integer> map = new HashMap<>();
    int max = 0;

    for(int[] a : l1){
        for(int[] b : l2){
          int x = a[0] - b[0];
          int y = a[1] - b[1];

          List<Integer> list = Arrays.asList(x, y);
          map.put(list, map.getOrDefault(list, 0)+1);
          max = Math.max(max, map.get(list));
        }
    }
    


       return max;
        
    }
}
