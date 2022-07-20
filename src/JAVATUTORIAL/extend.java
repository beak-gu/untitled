package JAVATUTORIAL;

class Division extends Calculator{


  public void division(){
    System.out.println(left/right);
  }
}
public class extend {
  public static void main(String[] args) {
    Calculator gang = new Division();
    gang.setOprands(20, 30);
    //gang.division();
  }

}
