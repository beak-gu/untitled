package BAEKJOON;


import java.util.Arrays;
import java.util.Scanner;

public class IOSU {
  public static void main(String[] args) {
    Scanner N = new Scanner(System.in);
    int n = N.nextInt();
    double q = 0;


    double[] arr = new double[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = N.nextInt();
    }
    Arrays.sort(arr);

    for(int a=0; a<arr.length-1 ;a++){
      q += ((arr[a]/arr[arr.length-1])*100);
    }
    System.out.println(q/arr.length);



  }
}
