package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class _1966 {


  public static class document {
    int num;
    int priority;

    public document(int num, int priority) {
      this.num = num;
      this.priority = priority;
    }
  }

  public static void main(String[] arg) {

    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();


    for (int p = 0; p < times; p++) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      Queue<document> queue = new LinkedList<>();

      for (int num = 0; num < N; num++) {

        int priority = sc.nextInt();
        queue.offer(new document(num, priority));
      }


      int b = 100;
      int count = 0;

      document a;


      while (M != b) {
        int max = 0;

        for (int i = 0; i < queue.size(); i++) {
          a = queue.poll();
          if (max < a.priority) {
            max = a.priority;
          }
          queue.offer(a);
        }


        while (true) {
          a = queue.poll();

          if (max == a.priority) {
            b = a.num;
            break;
          }
          queue.offer(a);

        }
        count++;


      }
      System.out.println(count);

    }
  }
}
