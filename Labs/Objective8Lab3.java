public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    
    for (int i = 1; i <= 20; i++) {
    if ((i % 2) == 0) {
        System.out.print("\n" + i + " Is Even");
    } else if ((i % 2) >= 0) {
        System.out.print("\n" + i + " Is Odd");
    }
    }
  }
}