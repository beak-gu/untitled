package BAEKJOON;

import java.util.Scanner;

public class GSGP {
  public static void main (String[] args){
    Scanner J = new Scanner(System.in);
    int j = J.nextInt();


    if(j>=90)
      System.out.println("A");
    else if (80<=j) {
      System.out.println("B");
    }
    else if(70<=j){
      System.out.println("C");
    }
    else if(60<=j){
      System.out.println("D");
    }
    else {
      System.out.println("F");}
}}
