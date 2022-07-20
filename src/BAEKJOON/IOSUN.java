package BAEKJOON;

import java.util.Scanner;

public class IOSUN {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[] arr = new double[N];
    double max = 0;
    double sum = 0;

    for (int i=0 ; i<arr.length ; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for(int j=0 ; j<arr.length ; j++) {
      arr[j] = arr[j]/max*100;
      sum += arr[j];
    }
    System.out.println(sum/arr.length);
  }
}
