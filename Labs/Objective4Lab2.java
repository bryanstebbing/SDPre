import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

    System.out.println("Please enter the first whole number you would like to add.");
    int num1 = keyboard.nextInt();
    
    System.out.println("Please enter the second whole number you would like to add.");
    int num2 = keyboard.nextInt();
    
    System.out.println("Please enter the third whole number you would like to add.");
    int num3 = keyboard.nextInt();
    
    System.out.println("Please enter the first decimal number you would like to add.");
    double num4 = keyboard.nextDouble();
    
    System.out.println("Please enter the second decimal number you would like to add.");
    double num5 = keyboard.nextDouble();
    
    System.out.println("Please enter the third decimal number you would like to add.");
    double num6 = keyboard.nextDouble();

    System.out.println("The sum of " + num1 +  "+" + num2 +  "+"  + num3 +  " is " + (num1 + num2 + num3));
    System.out.println("The sum of " + num4 +  "+" + num5 +  "+"  + num6 +  " is " + (num4 + num5 + num6));
   
  }
}

  }
}
