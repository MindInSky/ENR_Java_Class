import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

//- Crear un programa que nos indique si un numero es primo o no

public class PrimeOrNot {

  public static void main( String [] args ) {

    int wholeNumber;

    try (Scanner scan = new Scanner(System.in);) {
      System.out.println("Input a whole number to check if its prime");
      wholeNumber = Integer.parseInt(scan.nextLine());
    }

    ArrayList<Integer> DivisorList = new ArrayList<>();

    for(int i = 1; i <= wholeNumber ; i++ ){
      if( wholeNumber%i == 0 ){ //if == 0 its a whole divisor of n
        DivisorList.add(i);
      }
    }

    if(DivisorList.size() <= 2){
      System.out.println(wholeNumber + " is a prime number");
    } else {
      System.out.println(wholeNumber + " is not a prime number");
    }

    System.out.println("With Method");

    BigInteger b = new BigInteger(String.valueOf(wholeNumber));

    if(b.isProbablePrime(1)){
      System.out.println(wholeNumber + " is a prime number");
    } else {
      System.out.println(wholeNumber + " is not a prime number");
    }

  }
}