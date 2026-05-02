class Solution {
    public List<Integer> orArray(List<Integer> A) {
    
        List<Integer> list = new ArrayList<Integer>();

    for(int i = 0; i < A.size()-1; i++){
        list.add(A.get(i) | A.get(i+1));
    }
    return list;

    }
}
