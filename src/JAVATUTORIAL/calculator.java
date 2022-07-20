
package JAVATUTORIAL;

class calculator3{
  public static void sum(int left, int right){
    System.out.println(left+right);
  }
  public static void avg(int left,int right){
    System.out.println((left+right)/2);
  }
}
public class calculator {
  public static void main(String[] arg){
    calculator3.sum(10,20);
    calculator3.avg(10,20);

    calculator3.sum(20,40);
    calculator3.avg(20,40);

  }
}

