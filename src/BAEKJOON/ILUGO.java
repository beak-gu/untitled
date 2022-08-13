package BAEKJOON;


import java.util.*;

public class ILUGO {
  public static void main(String[] args){

    Stack<String> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();

    for(int i=0; i<w; i++){
      String s = sc.nextLine();
      String[] arr = s.split(" ");
      for(int j = 0; j<arr.length; j++){
        stack.push(arr[j]);
      }
      String S1 = "";
      for(int j = 0; j<arr.length; j++){
        S1 += stack.pop();
        if(j == arr.length-1)
          break;
        S1 += " ";
      }
      System.out.println(S1);
    }


  }
}
