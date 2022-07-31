package BAEKJOON;

import java.util.Scanner;

public class IGCP {
  static boolean sosu(int A){
    if (A == 1)
      return false;
    for (int i =2; i<A; i++) {
      if (A % i == 0)
        return false;

    }
    return true;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    int sum = 0;
    for(int i =0 ; i<arr.length ; i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<arr.length ; i++) {
      if (sosu(arr[i]) == true)
        sum += 1;
    }



    System.out.println(sum);

}}
