package hi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      String path = in.next();
      String myPath = getMyPath(path);
      System.out.println("Case #" + i + ": " + myPath);
    }
  }
  
  private static String getMyPath(String path) {
    String myPath = "";
    for(int i = 0; i < path.length(); i++){
      if(path.charAt(i) == 'S'){
        myPath += "E";
      }
      else{
        myPath += "S";
      }
    }
    return myPath;
  }
}
