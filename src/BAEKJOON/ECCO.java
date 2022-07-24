package BAEKJOON;

import java.util.Scanner;

public class ECCO {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int [][] APT = new int[15][15];
    for(int j = 0; j<15; j++){
      APT[0][j]=j;
      APT[j][0]=1;
    }
    for(int i=0; i<=T; i++){
      int k = sc.nextInt();
      int n = sc.nextInt();
      for(int a = 1; a<=k ; a++) {

        for (int b = 2; b <= n; b++) {
          APT[a][b] = APT[a-1][b] +APT[a][b-1];
        }
      }

      System.out.println(APT[k][n]);
    }
  }
}
