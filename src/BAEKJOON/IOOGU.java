package BAEKJOON;

import java.util.Scanner;

class Test {
  long sum = 0;
  public long sum(int[] a) {
    for(int i=0; i<a.length; i++) {
    sum += a[i];
    }
    return sum;
  }
}
public class IOOGU {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    long a = 0;

    for(int i = 0 ; i<arr.length ; i++){
      arr[i] = sc.nextInt();}
    Test t = new Test();
    a = t.sum(arr);
    System.out.println(a);
    }
  }

