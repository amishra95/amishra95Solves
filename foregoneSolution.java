import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Solution {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      
      // int count = 1; // choose something other than 1
      int digit = getDigitContainingFour(n);
      int count = (int)Math.pow(10, digit);
      while (containsFour(count) || containsFour(n-count)) {
        count++;
      }

			System.out.println("Case #" + i + ": " + count + " " + (n-count));
    }
  }
  
  private static int getDigitContainingFour(int n) {
    String str2 = String.valueOf(n);
    int index = str2.indexOf("4");
    // if n == 1450, index = 1, length = 4, --> 2
    // if n == 400, index = 0, length = 3, --> 2
    // if n == 11400, index = 2, --> 2
    // if n == 14000, index = 1, --> 3
   	int digit = str2.length() - index - 1;
    if (index == -1) {
      return 0;
    }
    return digit;
  }
  
  private static boolean containsFour(int n) {
      
    String str1 = String.valueOf(n);
      if(str1.contains("4")){
       return true;
     }
      
      return false;
    
    }
}