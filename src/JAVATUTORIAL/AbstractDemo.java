package JAVATUTORIAL;

import java.util.Scanner;

abstract class _Calculator{
  int left, right;
    public void setOprands(int left, int right){
      this.left = left;
      this.right = right;
    }
    int _sun(){
      return this.left + this.right;
    }
    int _avg(){
      return (this.left*this.right)/2;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
      sum();
      avg();
    }
}
class CalculatorDecoplus extends _Calculator{
  public void sum(){
    System.out.println("+sum : "+_sun());
  }
  public void avg(){
    System.out.println("+avg:"+_avg());
  }
}

public class AbstractDemo {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int C = sc.nextInt();
    int B = sc.nextInt();
    CalculatorDecoplus A = new CalculatorDecoplus();
    A.setOprands(C,B);
    A.run();

  }
}
