package DOIT;

import java.util.Scanner;

public class Max4m {
  static int max4(int a, int b, int c, int d){
    if(b>a)
      a=b;
    if (c>a)
      a=c;
    if (d>a)
      a=d;
    return a;

  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(max4(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
  }
}
