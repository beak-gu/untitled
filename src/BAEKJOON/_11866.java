package BAEKJOON;
import java.util.*;
public class _11866 {
  public static void main(String[] args){
    Queue<Integer> queue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();


    for(int i = 0 ; i<N ; i++){
    queue.offer(i+1);
    }

    StringBuilder sb = new StringBuilder();
    sb.append('<');

    while(queue.size()>1){
      for (int i = 1; i < M; i++) {
        int Q = queue.poll();
        queue.offer(Q);
      }
     sb.append(queue.poll()).append(", ");
    }
    sb.append(queue.poll()).append('>');

    System.out.println(sb);




  }
}
