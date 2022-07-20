package JAVATUTORIAL;


class C1{
  static int A = 1;
  int B = 2;
  static void clas(){
    System.out.println(A);
  }
  public void instance(){
    System.out.println(B);
  }
}

public class classinstance {
  public static void main (String[] arg){
    C1 c = new C1();
    c.instance();
    c.clas();
    C1.clas();




  }


}
