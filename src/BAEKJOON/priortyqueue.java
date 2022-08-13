package BAEKJOON;
import java.util.*;

public class priortyqueue {
  public static class job implements Comparable<job>{
    int num;
    int priority;

    public job(int num, int priority) {
      this.num = num;
      this.priority = priority;
    }
    @Override
    public int compareTo(job o){
      if(o.priority-this.priority==0){
        return o.num - this.num;
      }
      else
      return o.priority - this.priority;


    }
  }
  public static void main(String[] args) {
    PriorityQueue<job> pq = new PriorityQueue<job>();
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int count = 0;
    int compare = -1;

    for(int num = 0; num<M ; num++){
      int priority = sc.nextInt();
      pq.offer(new job(num,priority));
    }
    while(!pq.isEmpty()){
      System.out.println(pq.poll().num);
    }

/*    while(compare!= N){
      compare = pq.poll().num;
      count++;
    }*/
    //System.out.println(count);
  }

}
