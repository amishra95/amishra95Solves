/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Arrays.*;

class Solution {
    public int[] findMode(TreeNode root) {
        Integer[] values = extractValues(root).toArray(new Integer[] {});
        Arrays.sort(values);
        int[] a = new int[values.length];
    
        for(int i = 0; i < values.length-1; i++){
        if(values[i] == values[i+1]){
           addOneIntToArray(a,values[i]);
        }
    }

        return a;
    }
    
    public static int[] addOneIntToArray(int[] initialArray , int newValue) {

    int[] newArray = new int[initialArray.length + 1];
    for (int index = 0; index < initialArray.length; index++) {
        newArray[index] = initialArray[index];
    }

    newArray[newArray.length - 1] = newValue;
    return newArray;
}

    
    private static List<Integer> extractValues(TreeNode n) {
    List<Integer> result = new ArrayList<>();
    if (n.left != null) {
        result.addAll(extractValues(n.left));
    }

    if (n.right != null) {
        result.addAll(extractValues(n.right));
    }

    result.add(n.val);

    return result;
}

}