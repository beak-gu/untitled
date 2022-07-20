package FORUNDERSTAND;

class Calculator{
  static int base;
  int left,right,third;

  public void setOperands(int left, int right){
    System.out.println("setOperands(int left,int right)");
    this.left = left; // this.left= 전역변수
    this.right = right;
  }
  public void setOperands(int left, int right,int third){
    System.out.println("setOperands(int left,int right, int third)");
    this.left = left; // this.left= 전역변수
    this.right = right;
    this.third = third;
  }

  public void sum(){
    System.out.println(this.left+this.right+this.third);
  }


}

class DivisionCalculator extends Calculator{
  public void division(){
    System.out.println(this.left/this.right);
  }
  public void Nam(int left,int right){
    super.left = left;
    super.right = right;
  }

}
public class InputDemo {
  public static void main (String[] arg){
    DivisionCalculator  c1 = new DivisionCalculator();
    c1.setOperands(30,10);
    c1.sum();
    c1.division();
    c1.Nam(40,10);
    c1.sum();
    c1.division();
  }
}










