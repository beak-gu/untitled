package JAVATUTORIAL;



class Calculator{
  static double PI = 3.14;
  static int base;
  int left,right;

  public void setOprands(int left, int right){
    this.left = left; // this.left= 전역변수
    this.right = right;
  }

  public void sum(){
    System.out.println(this.left+this.right+base);
  }

  public void avg(){
    System.out.println((this.left+this.right)/2);
  }

}
class SubstactionCalculator extends Calculator{

  public void substract() {
    System.out.println("this.left/this.right");
  }
}
class InputDemo {
  public static void main(String[] args) {

    SubstactionCalculator c1 = new SubstactionCalculator ();
    c1.setOprands(10, 20);
    c1.sum();
    c1.avg();
    c1.substract();


    Calculator c2 = new Calculator();
    c2.setOprands(30, 40);
    c2.sum();
    c2.avg();

    System.out.println(Calculator.PI);

    Calculator.base = 10;

    c1.sum();

  }
}


