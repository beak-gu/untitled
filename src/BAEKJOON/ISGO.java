package BAEKJOON;

import java.util.Scanner;

public class ISGO {
  static public void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] arr = new int[N];
    int[] A = new int [3];
    for(int i=0; i<M ; i++){
      for(int j=0; j<3 ;j++){
      A[j] = sc.nextInt();
      }
      if(A[0] == 0){
        for(int p = A[1]; p<A[2] ; p++){
          if(arr[p] == 0)
            arr[p] = 1;
          else
            arr[p] = 0;
        }
        int sum = 0;
        for(int p = A[1]; p<A[2] ; p++){
          if(arr[p] == 1){
            sum += 1;}
        }
        System.out.println(sum);
      }
      else{

          int sum = 0;
          for(int j = A[1]; j<A[2] ; j++){
            if(arr[j] == 1){
              sum += 1;}
          }
          System.out.println(sum);



      }
    }
  }
}
