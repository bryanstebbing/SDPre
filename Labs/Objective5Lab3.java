import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Please enter a number: ");
      int num1 = keyboard.nextInt();

    	if(num1 == 0) {
     	 System.out.println("The number is positive");
    }
   		else if(num1 > 0){
      	 System.out.println("The number is positive");
    }
       	else if(num1 < 0){
      	 System.out.println("The number is Negative");
    }
    
      scanner.close();
  }
}