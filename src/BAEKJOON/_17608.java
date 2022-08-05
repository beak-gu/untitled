package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class _17608 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      stack.push(sc.nextInt());

    }
    int count = 1;
    int max = stack.pop();
    while (stack.size() > 0) {
      int a = stack.pop();
      if (max < a) {
        max = a;
        count++;
      }


    }
    System.out.println(count);
  }
}
