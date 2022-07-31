package BAEKJOON;

import java.util.Scanner;

  public class ISGONEW {
    static void ban (int[] arr, int a, int b){
      for(int p = a; p<b ; p++){
        if(arr[p] == 0)
          arr[p] = 1;
        else
          arr[p] = 0;
      }
      int sum = 0;
      for(int p = a; p<b ; p++){
        if(arr[p] == 1){
          sum += 1;}
      }
      System.out.println(sum);
    }
    static void gea (int[] arr, int a, int b){
      int sum = 0;
      for(int p = a; p<b ; p++){
        if(arr[p] == 1){
          sum += 1;}
      }
      System.out.println(sum);
    }

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
          ban(arr, A[1], A[2]);
        }
        else{
          gea(arr,A[1], A[2]);
        }
      }
    }
  }

